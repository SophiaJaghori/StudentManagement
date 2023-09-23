package student_controller;


import java.util.Scanner;

import student_service.Service;

public class Controller {
	Service serv;
	Scanner sc = new Scanner(System.in);
	
	public Controller() {
		serv = new Service();
	}
	public void accept(int choice) {
		switch(choice) {
		case 1:
			serv.save();
			break;
		case 2:
			serv.fetch();
			break;
		case 3:
			System.out.println("pelease enter student id! ");
			String sId = sc.next();
			
			serv.modify(sId);
			break;
		case 4:
			System.out.println("Please enter student id !");
			String id = sc.next();
			serv.delete(id);
			break;
		case 5:
			System.out.println("Please enter an id which you want to see");
			String Sid = sc.next();
			serv.findbyId(Sid);
			break;
		case 6:
			System.out.println("This is youngest Student");
			serv.findYoungest();
		case 7:
			System.exit(choice);
			break;
			
		}
		
	}	
		

}
