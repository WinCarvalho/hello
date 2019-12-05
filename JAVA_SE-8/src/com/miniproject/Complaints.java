package com.miniproject;

import java.util.Scanner;

public class Complaints {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select option number ");
		System.out.println("1.Display details according to year");
		System.out.println("2.Display details according to bank name");
		System.out.println("3.Display details according to customer id");
		System.out.println("4.Display details according to Days required to complete complain");
		System.out.println("5.Display details according to closed Complaints");
		System.out.println("6.Display details according to which received a timely response");
		System.out.println("7.Enter new Complains ");
		Complaints cp = new Complaints();
		int choice = sc.nextInt();
				
		switch(choice) {
		case 1 :
			Year.year();
			break;
		case 2 :
			Bank.bank();
			break;
		case 3 :
			customer_id.id();
			break;
		case 4 :
			break;
		case 5 :
			break;
		case 6 :
			Timely_Response.timely_response();
			break;
		case 7 :
			break;
		 default :
			 System.out.println("Exit");
			 break;
		
		
		}
		
	}
}
