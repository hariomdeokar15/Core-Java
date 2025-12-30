package com.org.singleinheritance.secondexample;

public class CollegeStudent extends Student {
	
	String university;
	int prnNo;
	String course;
	String department;
	String branch;
	double fees;
	double cgpa;
	
	
	
	public CollegeStudent(String name, int rollNo, int age, double marks, String email, String mobileNo,
			String university, int prnNo, String course, String department, String branch, double fees,
			double cgpa) {
		super(name, rollNo, age, marks, email, mobileNo);
		this.university = university;
		this.prnNo = prnNo;
		this.course = course;
		this.department = department;
		this.branch = branch;
		this.fees = fees;
		this.cgpa = cgpa;
	}
	
    void display() {
    	super.display();
    	System.out.println("University: "+university);
    	System.out.println("Prn: "+prnNo);
    	System.out.println("Course: "+course);
    	System.out.println("Department: "+department);
    	System.out.println("Branch: "+branch);
    	System.out.println("Fees: "+fees);
    	System.out.println("cgpa: "+cgpa);
    	
    }


	void placement() {
		if(cgpa>8) {
			System.out.println("Elidgible for Placement");
		}
	}

}
