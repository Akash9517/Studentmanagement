package Studentmanagement;

import java.io.*;
import java.util.Map;
import java.util.Scanner;


public class StudentMgtSystem {

	Scanner in = new Scanner(System.in); // Create a Scanner object

	String n;
	String D;
	int r;


	public static void main(String[] args) {

		StudentMgtSystem demo = new StudentMgtSystem();
		int choice;
		do {
			choice = demo.menu();
			demo.process(choice);
		} while (choice != 0);


	}

	public int menu() {
		System.out.println();
		System.out.println("** MENU **");
		System.out.println("Before adding the student check the recently added student");
		System.out.println("Add Student.........1");
		System.out.println("Search Student......2");
		System.out.println("Update Student...3");
		System.out.println("Delete Student...4");
		System.out.println("recent added student.....5");
		System.out.println("List of all student.....6");
		System.out.println("Exit.............0");
		System.out.println("------------------");
		System.out.println("Please enter your choice:");
		int input = in.nextInt();
		return input;
	}

	public void process(int choice) {

		StudentMgtService service = new StudentMgtService();



		switch (choice) {

			case 1:
				//add a student
				System.out.println("student ko add karenge");
				//to get all the student values

				Scanner s=new Scanner(System.in);

				System.out.println("enter the name");
				 n=s.nextLine();

				System.out.println("enter the roll");
				 r=s.nextInt();

				s.nextLine();
				System.out.println("enter the Department");
				 D=s.nextLine();

				Student student = new Student(n,r,D);

				service.save(student);

				System.out.println("Student Added Successfully");
				break;

			case 2:
				//search a student

				System.out.println("student ko search karenge");

				Scanner r1=new Scanner(System.in);
				System.out.println("enter roll to search");
				int rolltosearch= r1.nextInt();

				 Student obj1=service.find(rolltosearch);

				System.out.println(obj1);

				System.out.println("Search successfully");



				break;


			case 3:

				//update a student

				Scanner s3=new Scanner(System.in);
				System.out.println("enter the rollno to update");
				int rollNumbertoupdate = s3.nextInt();

				System.out.println("enter the name to update");
				s3.nextLine();
				String n3=s3.nextLine();

				System.out.println("enter the department");
				String depart=s3.nextLine();

				Student obj3 = new Student(n3,rollNumbertoupdate,depart);

				service.update(obj3);
				System.out.println("Student updated sucessfullys");

				break;



			case 4:

				//to delete a student

				System.out.println("student ko delete karenge");

				Scanner s4=new Scanner(System.in);
				System.out.println("enter the rollno to delete");
				int rollNumbertodelete = s4.nextInt();

				Student obj4 = new Student(n,r,D);

				service.delete(rollNumbertodelete);

				System.out.println("Student delete sucessfully");

				break;
			case 5:

				//to get roll no information
				System.out.println("student list ");

				Student obj5= new Student(n,r,D);

				service.recentupdate(obj5);


				break;



			case 6:
				// recent update
				service.Allstudentlist();

				break;

			case 0:


				System.out.println("Thanks for using");
				break;

			default:
				break;
		}

	}

}
