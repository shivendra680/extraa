
Note: All the classes should be part of packages. Create proper package hierarchy.
1) A Job tracker application is used for tracking the activities of a team. Each activity is represented as a Job class. Create a class Job with the attributes job name, owner, effort required( in months), month of creation, year of creation, status ( not started/ work in progress/completed). 
Write necessary methods to accept and display the information. Create the constructors based on the below rules.
a.	Job name and owner are mandatory fields and should be supplied at the time of creating a class
b.	Compiler should raise an error when we try to create Job object with out passing any parameters.
c.	Write a constructor which accepts all the attributes as parameters while creating the object. From this constructor call the constructor (mentioned at point a) to initialize mandatory fields

2) In the above class create a static variable jobsCount. Write necessary methods to get the values. Every time an object of Job is created,
increment the value of jobsCount variable.

3) Create a jobld field. Make this variable as a readOnly method (make it private and write only getter method). Generate jobld value by
using the below formula
jobld="jobName"+"_"+jobsCount
eg. if the Job name is "Maintain Server" and the value of jobsCount variable is 31, then store Maintain Server_31 in jobld

4) Class PriorityJob contains all the attributes of Job class and other attributes to store the priority of the job (low, medium, high) and
monitored By field to store the name of the person monitoring Job Class MultiOwnerJob contains all attributes of Job class and other
name of the second owner.
a.	Write necessary classes, constructors and methods for storing and displaying additional information.
Hint: use super keyword to call the methods/constructor of super class.

5) In the Job class write a method called show Details() which returns a String by concatenating all the field values.
