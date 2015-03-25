package Collection;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setNameCourse("Java1");

		Course course2 = new Course();
		course2.setNameCourse("Java2");

		ArrayList<Course> stuCourseList = new ArrayList<Course>();
		stuCourseList.add(course1);
		stuCourseList.add(course2);

		Address address1 = new Address();
		address1.setStreet("panich");
		address1.setDistrict("nakhon1");
		address1.setProvince("nakhonnayok");
		address1.setZipcode(26000);

		Address address2 = new Address();
		address2.setStreet("panich2");
		address2.setDistrict("nakhon2");
		address2.setProvince("nakhonnayok2");
		address2.setZipcode(26002);

		Address address3 = new Address();
		address3.setStreet("panich3");
		address3.setDistrict("nakhon3");
		address3.setProvince("nakhonnayok3");
		address3.setZipcode(26003);

		ArrayList<Address> addressTeacher1 = new ArrayList<Address>();
		addressTeacher1.add(address1);
		addressTeacher1.add(address2);

		ArrayList<Address> addressTeacher2 = new ArrayList<Address>();
		addressTeacher2.add(address1);
		addressTeacher2.add(address2);
		addressTeacher2.add(address3);

		Teacher teacher1 = new Teacher();
		teacher1.setFirstName("Teacher1");
		teacher1.setLastName("Sil");
		teacher1.setAge("24");
		teacher1.setSex("male");
		teacher1.setAddressListTeacher(addressTeacher1);
		teacher1.setTeacherCourse(course1);

		Teacher teacher2 = new Teacher();
		teacher2.setFirstName("Teacher2");
		teacher2.setLastName("Sil2");
		teacher2.setAge("24");
		teacher2.setSex("male");
		teacher2.setAddressListTeacher(addressTeacher2);
		teacher2.setTeacherCourse(course2);
		// tea2.Drive();

		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);

		Student stu = new Student();
		stu.setFirstName("wan");
		stu.setLastName("Siloodjai");
		stu.setAge("23");
		stu.setSex("Female");
		stu.setAddressTeacher(address1);
		stu.setStuCourse(stuCourseList);
		stu.setTeacherList(teacherList);

		Student stu2 = new Student();
		stu2.setFirstName("stu");
		stu2.setLastName("Siloodjai2");
		stu2.setAge("23");
		stu2.setSex("Female");
		stu2.setAddressTeacher(address2);
		stu2.setStuCourse(stuCourseList);
		stu2.setTeacherList(teacherList);

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(stu);
		studentList.add(stu2);

		teacher1.setStudentList(studentList);
		teacher2.setStudentList(studentList);

		System.out.println("Name : " + stu.getFirstName() + '\t'+" LastName : "
				+ stu.getLastName() + '\t'+" Age : " + stu.getAge() +'\t'+ " Sex : "
				+ stu.getSex());
		System.out.println("Street : " + stu.getAddressTeacher().getStreet()+'\t'
				+ " District : " + stu.getAddressTeacher().getDistrict() +'\t'+ " Province : "
				+ stu.getAddressTeacher().getProvince() +'\t'+ " Zipcode : "
				+ stu.getAddressTeacher().getZipcode());
		System.out.println("Course : " + stu.getStudentCourse().size());
		for (Course course01 : stu.getStudentCourse()) {
			System.out.println("Name course : " + course01.getNameCourse());
		}
		System.out.println("Teacher : " + stu.getTeacherList().size());
		for (Teacher teacher01 : stu.getTeacherList()) {
			System.out.println("Name teacher : " + teacher01.getFirstName());
		}

		System.out.println("*********************");

		System.out.println("Name : " + stu2.getFirstName() +'\t'+ " LastName : "
				+ stu2.getLastName()+'\t' + " Age : " + stu2.getAge() +'\t'+ " Sex : "
				+ stu2.getSex());
		System.out.println("Street : " + stu2.getAddressTeacher().getStreet()+'\t'
				+ " District : " + stu2.getAddressTeacher().getDistrict()+'\t'
				+ " Province : " + stu2.getAddressTeacher().getProvince() +'\t'+ " Zipcode : "
				+ stu2.getAddressTeacher().getZipcode());
		System.out.println("Course : " + stu2.getStudentCourse().size());
		for (Course course02 : stu2.getStudentCourse()) {
			System.out.println("Name course : " + course02.getNameCourse());
		}
		System.out.println("Teacher : " + stu2.getTeacherList().size());
		for (Teacher teacher02 : stu2.getTeacherList()) {
			System.out.println("Name teacher : " + teacher02.getFirstName());
		}

		System.out.println("*********************");

		System.out.println("Firstname : " + teacher1.getFirstName() +'\t'+ " Lastname : "
				+ teacher1.getLastName() + '\t'+" Age : " + teacher1.getAge()+'\t' + " Sex : "
				+ teacher1.getSex());
		System.out.println("Course : " + teacher1.getTeacherCourse().getNameCourse());
		System.out.println("Address : " + teacher1.getAddressListTeacher().size());
		for (Address addr : teacher1.getAddressListTeacher()) {
			System.out.println("Street : " + addr.getStreet()+'\t' + " District : "
					+ addr.getDistrict() + '\t'+" Province : " + addr.getProvince()+'\t'
					+ " Zipcode : " + addr.getZipcode());
		}
		System.out.println("Student : " + teacher1.getStudentList().size());
		for (Student student01 : teacher1.getStudentList()) {
			System.out.println("Name student : " + student01.getFirstName());
		}
		teacher1.drive();

		System.out.println("*************************");

		System.out.println("Firstname : " + teacher2.getFirstName()+'\t'
				+ " Lastname : " + teacher2.getLastName() + '\t'+" Age : "
				+ teacher2.getAge() + '\t'+" Sex : " + teacher2.getSex());
		System.out.println("Course : " + teacher2.getTeacherCourse().getNameCourse());
		System.out.println("Address : " + teacher2.getAddressListTeacher().size());
		for (Address addr02 : teacher2.getAddressListTeacher()) {
			System.out.println("Street : " + addr02.getStreet()+'\t'
					+ " District : " + addr02.getDistrict() + '\t'+" Province : "
					+ addr02.getProvince()+'\t' + " Zipcode : "
					+ addr02.getZipcode());
		}
		System.out.println("Student : " + teacher2.getStudentList().size());
		for (Student student02 : teacher2.getStudentList()) {
			System.out.println("Name student : " + student02.getFirstName());
		}
		teacher2.drive();

		System.out.println("*************************");

	}

}
