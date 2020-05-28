package timetableM2T.handlers;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;

import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.apache.commons.io.FileUtils;

public class SampleHandler extends AbstractHandler {

	private EmfModel model;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		var file_name = Platform.getLocation();
		System.out.println(file_name);
		var plugin_path = Platform.getBundle("timetableM2T").getLocation().replace("reference:file:/", "");
		System.out.println(plugin_path);

		// Parse main.egx
		EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
		try {

			module.parse(new File(plugin_path + "/timetableM2T.egx").getAbsoluteFile());
			System.out.println("EGX parsing finished.");

			if (!module.getParseProblems().isEmpty()) {
				System.out.println("Syntax errors found. Exiting.");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Load the model
		
		model = new EmfModel();

		try {
			
			model = createEmfModel("Model", file_name + "/timetable/MyTimetable.coursescheduling",
					plugin_path + "/courseScheduling.ecore", true, false);
			System.out.println("Emf model and the ecore loaded.");

		} catch (EolModelLoadingException e1) {
			
			e1.printStackTrace();
		} catch (URISyntaxException e1) {
			
			e1.printStackTrace();
		}
		
		try {

			// Make the document visible to the EGX program
			module.getContext().getModelRepository().addModel(model);
			// ... and execute
			module.execute(); 
			System.out.println("EGX executed.");

		} catch (EolRuntimeException e) {
			e.printStackTrace();
			
		}
		
		//move file to the user workspace
		File srcfile = new File(plugin_path+"/timetable.html");
		File destfile = new File(file_name + "/timetable/" + srcfile.getName());

		try {
			FileUtils.copyFile(srcfile, destfile);
			System.out.println("File is moved successful!");
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MessageDialog.openInformation(window.getShell(), "Timetable", "Complete html generation!");
			
			if (!srcfile.delete()) {
				FileUtils.deleteQuietly(destfile);
				throw new IOException("Failed to delete original file '" + srcfile +
						"' after copy to '" + destfile + "'");
			}

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		module.getContext().getModelRepository().dispose();
		model.close();
		
		return null;
	}

	protected EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, new File(metamodel).toURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, new File(model).toURI().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

}
