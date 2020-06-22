# DSL in time table
* This project aims to develop a domain specific language in timetabling at high school. Users edits the timetable in a tree-based editor and export the results. I use Emfatic Modeling Language to define the metamodel and generate an eclipse application – tree-based editor. I write an Epsilon Validation Language file to implement the validation of the model and use Epsilon Generation Language to transform the model to a html file. And I integrate these two files into two plug-in projects to execute with one single button.

1. Use Emfatic Modeling Language to define the metamodel, Epsilon Validation Language to implement the validation of the model and Epsilon Generation Language to transform the model to a html file. 

<img src="/term-project%20UML.png" width=50%> </img>

2. Users use a tree-based editor to make a timetable. 

<img src="/Tree-based%20editor.png" width=50%> </img>

3. The result will be automatic validated and transformed to a html file.

<img src="/timetables.png" width=50%> </img>
