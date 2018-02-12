package com.elife.corejavaprogs;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student(10);
		Student stud1 = new Student(35);
		change(stud);
		System.out.println(stud.sid);
		

	}

	private static void change(Student stud) {
		// TODO Auto-generated method stub
		stud.sid = stud.sid+10;
	}

}
class Student{
	static int sid;
	Student(int sid){
		this.sid = sid;
		
	}
}
