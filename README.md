# TDT4250-1

## Running the transformation on sample input models
1. Right-click on the mainGen.mtl file > Run as > Run configurations
2. Paste /org.tdt4250.project2.instance/department.studyprogram in the Model field
3. Run the file
4. Open the generated html file in a browser

## Model changes
Since assignment 1, we improved the model by removing the Base class and moving the baseSemesters property to the Program class. We also added a top-level object, Department, that contains courses and study programs. Furthermore, we removed the "mandatory" attribute for a course slot, using the size of the attribute "availableCourses" to indicate whether a slot is mandatory or elective.
