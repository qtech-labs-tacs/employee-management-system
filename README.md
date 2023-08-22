#### Dependency Management and Dependencies Difference


##### Structural Difference

* The main structural difference between these two tags is the logic of inheritance.
* We define the version in the dependencyManagement tag, and then we can use the mentioned version without specifying it in the next dependencies tag.



##### Behavioral Difference

* dependencyManagement is just a declaration, and it does not really add a dependency. 
* The declared dependencies in this section must be later used by the dependencies tag.
* It is just the dependencies tag that causes real dependency to happen.