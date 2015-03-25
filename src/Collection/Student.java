package Collection;

import java.util.List;

public class Student extends Person {
	private Address addressTeacher;
	private List<Course> studentCourse;
	private List<Teacher> teacherList;

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public Address getAddressTeacher() {
		return addressTeacher;
	}

	public void setAddressTeacher(Address addressTeacher) {
		this.addressTeacher = addressTeacher;
	}

	public List<Course> getStudentCourse() {
		return  studentCourse;
	}

	public void setStuCourse(List<Course>  studentCourse) {
		this. studentCourse =  studentCourse;
	}

}
