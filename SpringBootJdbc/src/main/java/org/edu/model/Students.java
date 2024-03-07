package org.edu.model;

public class Students {
	private int studentId;
	private String studentName;
	private int age;

	public Students() {
	}
	
	public Students(int studentid, String studentName) {
		this.studentId=studentid;
		this.studentName=studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	};

}
