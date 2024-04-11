//Amber Anderson
//Chpt 7 PA

#include <stdio.h>
#include <string.h>
#include "Student.h"

Student InitStudent() {	//initializes name to "Louie" and gpa to 1.0
   Student tempStudent;

   strcpy(tempStudent.name, "Louie");
   tempStudent.GPA = 1.0;

   return tempStudent; //return Student tempStudent to main
}

Student SetName(char* name, Student s) { 	//sets the student's name
	strcpy(s.name, name);
	return s; //return Student s to main
}
	
Student SetGPA(double gpa, Student s) { 	//sets the student's GPA
	s.GPA = gpa;
	return s;	//return Student s to main
}
	
void GetName(char* studentName, Student s) { 	//return the student's name in studentName
	strcpy(studentName, s.name);
}
	
double GetGPA(Student s) { //returns the students GPA
	return s.GPA;
}