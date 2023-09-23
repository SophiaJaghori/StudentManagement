package student_main;


import java.util.Scanner;

import student_controller.Controller;

public class Main {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Controller cr = new Controller();
		System.out.println("Welcome to Student management application ");
		do {
			System.out.println("1-Add record");
			System.out.println("2-read record");
			System.out.println("3-update record");
			System.out.println("4-delete record");
			System.out.println("5-find student record by Id ");
			System.out.println("6-youngest student record");
			System.out.println("7-Exit");
			System.out.println("Please enter your choice... ");
			choice = sc.nextInt();
			cr.accept(choice);
			
			
			
			
			
			
			
			
		}while(choice !=7);
		sc.close();

	}

}
