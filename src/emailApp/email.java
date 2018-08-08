package emailApp;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String email;
	private int mailBoxCapacity=500;
	private String companySuffix="iubat.edu";
	
	//Constructor to receive the first name and last name
	public email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created: "+this.firstName+" "+this.lastName);
		//call a method asking for the department return the department
		this.department=setDepartment();
		System.out.println("Department: "+department);
		//call a method that returns random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Password is : "+this.password);
		//combine elements to generate email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email: "+email);
		
		
		
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("\nDepartment Code\nEnter 1 for development\n2 for sales\n3 for accounting\nEnter department code: \n");
		Scanner in=new Scanner(System.in);
		int departmentChoice=in.nextInt();
		if(departmentChoice==1) { return "dev";}
		else if(departmentChoice==2) { return "sal";}
		else if(departmentChoice==3) { return "acc";}
		else { return "";}
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
	}

	
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int Capacity) {
		this.mailBoxCapacity = Capacity;
	}
	
	
	//Set alternative email
	public void setAlternativeEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity() {return mailBoxCapacity; }
	public String getAlternativeEmail() {return alternateEmail; }
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Name: "+firstName+" "+lastName+
				"\nDepartment: "+department+
				"\nEmail: "+email;
	}
	
}
