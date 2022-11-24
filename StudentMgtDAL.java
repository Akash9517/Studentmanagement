package Studentmanagement;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class StudentMgtDAL {


	public Student obj1=null;

	public void save(Student obj)
	{
		try {

			FileOutputStream fout=new FileOutputStream("C:\\Users\\Akash Pansare\\Desktop\\Studentmanagement\\studentfiles\\"+String.valueOf(obj.getRollNumber()) +".txt");
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			oos.writeObject(obj);
			oos.close();
			fout.close();
			System.out.println("adding student details done");

		} catch (Exception a) {

			System.out.println("exception");
		}

	}


	public Student find(int rollNumber) {

		try {

			FileInputStream fin=new FileInputStream("C:\\Users\\Akash Pansare\\Desktop\\Studentmanagement\\studentfiles\\"+String.valueOf(rollNumber)+".txt");
			ObjectInputStream ois=new ObjectInputStream(fin);
			 obj1=(Student) ois.readObject();

			ois.close();
			fin.close();
//			System.out.println("Address is :"+ obj1);
			
		} catch (Exception a) {

			System.out.println("exception"+a);
		}

		return obj1;
	}



	public void update(Student obj3)
	{

		try {

			FileOutputStream fout=new FileOutputStream("C:\\Users\\Akash Pansare\\Desktop\\Studentmanagement\\studentfiles\\"+String.valueOf(obj3.getRollNumber())+".txt");
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			oos.writeObject(obj3);
			oos.close();
			fout.close();
			System.out.println("process done");

		} catch (Exception a) {

			System.out.println("exception");
		}


	}


	public void delete(int rollNumbertodelete)
	{


		try {

            File fordelete=new File("C:\\Users\\Akash Pansare\\Desktop\\Studentmanagement\\studentfiles\\"+String.valueOf(rollNumbertodelete)+".txt");

			fordelete.delete();



		} catch (Exception a) {

			System.out.println("exception"+a);
		}


	}



	public void Allstudentlist() {


		File file=null,path1=null;

		String[] paths;
		try{
			file = new File("C:\\Users\\Akash Pansare\\Desktop\\Studentmanagement\\studentfiles");

			paths=file.list();

			for(String path:paths) {

				System.out.println("File :"+path);

			}

		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}


	public void recentupdate(Student obj5) {

		try {

			FileInputStream fin=new FileInputStream("C:\\Users\\Akash Pansare\\Desktop\\Studentmanagement\\studentfiles\\"+String.valueOf(obj5.getRollNumber())+".txt");
			ObjectInputStream ois=new ObjectInputStream(fin);
			obj5=(Student) ois.readObject();

			ois.close();
			fin.close();
			System.out.println("Address is :"+ obj5);

		} catch (Exception a) {

			System.out.println("exception"+a);
		}

	}






}
