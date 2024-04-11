//Amber Anderson
//Chpt7 PA

#ifndef STUDENT_H
#define STUDENT_H

typedef struct Student_struct { //defines the Student struct
   char name[20];	//variable to hold the student's name
   double GPA;		//variable to hold the student's GPA
} Student;

Student InitStudent(); //initializes name to "Louie" and gpa to 1.0

Student SetName(char *name, Student s); //sets the student's name

Student SetGPA(double gpa, Student s);  //sets the student's GPA

void GetName(char* studentName, Student s);  //return the student's name in studentName

double GetGPA(Student s);  //returns the students GPA

#endif