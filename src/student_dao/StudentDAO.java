package student_dao;

public interface StudentDAO {
	public void create();
	public void read();
	public void update(String sId);
	public void delete(String sId);
	public void findStudentById(String Id);
	public void findYoungestStudent();
	
	

}
