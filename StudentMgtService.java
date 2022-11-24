package Studentmanagement;

public class StudentMgtService {


	public void save(Student obj)
	{
		//save this info in DB/variable
		StudentMgtDAL dal = new StudentMgtDAL();

		dal.save(obj);

	}

	public Student find(int rollNumber) {
		StudentMgtDAL dal = new StudentMgtDAL();
		Student obj= dal.find(rollNumber);
        return obj;
	}

	public void update(Student obj1) {
		StudentMgtDAL dal = new StudentMgtDAL();
		dal.update(obj1);

	}


	public void delete(int rollNumbertodelete) {

		StudentMgtDAL dal = new StudentMgtDAL();
		 dal.delete(rollNumbertodelete);

	}


	public void Allstudentlist() {

		StudentMgtDAL dal = new StudentMgtDAL();
		 dal.Allstudentlist();

	}


	public void recentupdate(Student obj5) {

		StudentMgtDAL dal = new StudentMgtDAL();
		dal.recentupdate(obj5);

	}





}
