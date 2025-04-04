package me.chamodi.spring.model;

public class Course {
    private String courseName;
	private String courseCode;
	private String department;

	public Course(String courseName, String courseCode, String department) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.department = department;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getcourseCode() {
		return courseCode;
	}

	public void setcourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}