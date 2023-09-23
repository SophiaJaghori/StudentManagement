package student_service;

import student_dao.StudentDaoImpl;


public class Service {
	StudentDaoImpl impl;
	public Service() {
		impl = new StudentDaoImpl();
		
		
	}
	public void save() {
		impl.create();
	}
	public void fetch() {
		impl.read();
	}
	public void modify(String id) {
		impl.update(id);
	}
	public void delete(String id) {
		impl.delete(id);
	}
	public void findbyId(String id) {
		impl.findStudentById(id);
	}
	public void findYoungest() {
		impl.findYoungestStudent();
	}

	

	

}
