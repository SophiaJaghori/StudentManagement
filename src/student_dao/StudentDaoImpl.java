package student_dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import student_exception.MandatoryFieldExcepetion;
import student_model.Model;

public class StudentDaoImpl implements StudentDAO  {
	
	private Model md;
	public StudentDaoImpl() {
		this.md = new Model();
	}
	Model stuModel[];
	Scanner sc = new Scanner(System.in);


	@Override
	
	public void create() {
	    System.out.println("How many Students You want to store? ");
	    int size = sc.nextInt();
	   stuModel = new Model[size] ;// Initialize the array of Model objects
	   Model md = new Model();

	    for (int i = 0; i < size; i++) {
	        System.out.println("please enter Student Id ");
	        String sId = sc.next();
	        System.out.println("Please enter Student name");
	        String sName = sc.next();
	        System.out.println("Please enter Student email");
	        String sEmail = sc.next();
	        System.out.println("Please enter Student date of birth ");
	        String dob = sc.next();

	        // Create a new Model object for each student and store it in the array
	        md.setsId(sId);
	        md.setsName(sName);
	        md.setsEmail(sEmail);
	        md.setsDob(dob);
	        
	        stuModel[i] = md;
	    }

	    // Now, stuModel contains all the student information
	}


	private void validateMandatoryField(Model md) {
		if(md ==null) {
			throw new MandatoryFieldExcepetion();
		}
		else if(md.getsId()==null) {
		//	throw new MandatoryFieldExcepetion("Customer Id can not be left blank");
		}
		
	}

	@Override
	public void read() {
	    if (stuModel != null) {
	        for (int i = 0; i < stuModel.length; i++) {
	            if (stuModel[i] != null) {
	                System.out.println("Student Id: " + stuModel[i].getsId());
	                System.out.println("Student Name: " + stuModel[i].getsName());
	                System.out.println("Student Email: " + stuModel[i].getsEmail());
	                System.out.println("Student date of birth: " + stuModel[i].getsDob());
	            } else {
	                System.out.println("Student at index " + i + " is null.");
	            }
	        }
	    } else {
	        System.out.println("stuModel is null.");
	    }
	}



	@Override
	public void update(String sId) {
	    for (int i = 0; i < stuModel.length; i++) {
	        if (sId == null) {
	            continue;
	        }
	        if (stuModel[i].getsId().equals(sId)) {
	            System.out.println("Student found!");
	            System.out.println("What do you want to edit? ");
	            System.out.println("1-name");
	            System.out.println("2-email");
	            System.out.println("3-date of birth");

	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1: {
	                    System.out.println("Enter new name: ");
	                    String data = sc.next();
	                    stuModel[i].setsName(data);
	                    break;
	                }
	                case 2: {
	                    System.out.println("Enter new email: ");
	                    String data = sc.next();
	                    stuModel[i].setsEmail(data);
	                    break;
	                }
	                case 3: {
	                    System.out.println("Enter new date of birth: ");
	                    String data = sc.next();
	                    stuModel[i].setsDob(data);
	                    break;
	                }
	            }

	            System.out.println("Student id " + stuModel[i].getsId());
	            System.out.println("Student name " + stuModel[i].getsName());
	            break;
	        }
	    }
	}


	@Override
	public void delete(String sId) {
	    for (int i = 0; i < stuModel.length; i++) {
	        if (stuModel[i] != null && stuModel[i].getsId().equals(sId)) {
	            System.out.println("Student Deleted!");
	            System.out.println("Student Id: " + stuModel[i].getsId());
	            System.out.println("Student Name: " + stuModel[i].getsName());

	            // Shift the remaining elements to fill the gap
	            for (int j = i; j < stuModel.length - 1; j++) {
	                stuModel[j] = stuModel[j + 1];
	            }

	            // Set the last element to null to remove the duplicate entry
	            stuModel[stuModel.length - 1] = null;

	            break;
	        }
	    }
	}


	@Override
	public void findStudentById(String id) {
		
	    for (int i = 0; i < stuModel.length; i++) {
	    	if(stuModel[i].getsEmail()==null) {
	    		System.out.println("no students found!");
	    	}
	        if (stuModel[i].getsId().equals(id)) {
	            System.out.println("Student name: " + stuModel[i].getsName());
	            System.out.println("Student email: " + stuModel[i].getsEmail());
	            System.out.println("Student date of birth: " + stuModel[i].getsDob());
	            break;
	        }
	    }
	}


	@Override
	public void findYoungestStudent() {
		SimpleDateFormat sf = new SimpleDateFormat("mm-dd-yyyy");
		try {
			Date date = sf.parse(stuModel[0].getsDob());
			int index = 0;
			for(int i =1; i<stuModel.length; i++) {
				if(stuModel[i]==null) {
					continue;
				}
				
				System.out.println();
			}
		}catch(ParseException e) {
			System.out.println("Student not correct date format");
		}catch(NullPointerException e) {
			System.out.println("null student");
		}
		
	}

}
