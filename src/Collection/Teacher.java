package Collection;

import java.util.List;

public class Teacher extends Person implements Drive {
	private List<Address> addressListTeacher;
	private Course teacherCourse;
	private List<Student> studentList;
	

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Address> getAddressListTeacher() {
		return addressListTeacher;
	}

	public void setAddressListTeacher(List<Address> addressListTeacher) {
		this.addressListTeacher = addressListTeacher;
	}

	public Course getTeacherCourse() {
		return teacherCourse;
	}

	public void setTeacherCourse(Course teacherCourse) {
		this.teacherCourse = teacherCourse;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Have car.");
	}

}
