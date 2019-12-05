package com.classes;

public class Student {
	

		// feilds
		private int rollNo;
		private String name;
		private char gender;
		private boolean married;
		private float marks;

		private final float OUTOF_MARKS = 300;
		
		//default constructor
		public Student() {
			rollNo = 0;
			name = null;
			gender = ' ';
			married = false;
			marks = 0.00f;
			System.out.println("Student---> Default");
		}
		//parameterised constructor
		public Student(int prollNo, String pname, char pgender, boolean pmarried, float pmarks ) {
			rollNo = prollNo;
			name = pname;
			gender = pgender;
			married = pmarried;
			marks = pmarks;
			System.out.println("Student---> parameter");
		}
		
		//setter method
		
		public void setRollNo(int prollNo)
		{
			rollNo=prollNo;
		}
		public void setName(String pname)
		{
			name=pname;
		}
		public void setGender(char pgender)
		{
			gender=pgender;
		}
		public void setMarried(boolean pmarried)
		{
			married=pmarried;
		}
		public void setMarks(float pmarks)
		{
			marks=pmarks;
		}
		
		//getter method
		public int getRollNo()
		{
			return rollNo;
		}
		
		public String getName()
		{
			return name;
		}
		public boolean getMarried()
		{
			return married;
		}
		public char getGender()
		{
			return gender;
		}
		public float getMarks()
		{
			return marks;
		}
		
		@Override //java annotation
		public String toString() {
			return "RollNO : "+rollNo+"\tname: "+name+"\tmarried: "+married+"\tgender: "+gender+
					"\tmarks"+marks;
		}
		
		
		@Override 
		public boolean equals(Object obj) {
			System.out.println("Student-> equals...");
			Student otherStudent = (Student) obj;
			
			if (rollNo != otherStudent.getRollNo())  //==   --> primitive type
			{
				return false;
			}
			
			if (!name.equals(otherStudent.getName()))
			{
				return false;
			}
			
			if (married != otherStudent.getMarried())
		
			{
				return false;
			}
			if (gender != otherStudent.getGender())
			
			{
				return false;
			}
			if (marks != otherStudent.getMarks())
			
			{
				return false;
			}
			else
			{
				return true;
			}
			
		}
		
		public double calPercentage() {
			
			return (marks/OUTOF_MARKS)*100;
						
			
		}
		
		public String calGrade() {
			double percentage = calPercentage();
			if(percentage > 75)
			{
				return "A";
			}
			else if(percentage > 60 && percentage < 75)
			{return "B";}
			else
			{return "C";}
		}
		
		public void printResult() {
			System.out.println("RollNO : "+rollNo);
			System.out.println("Name :"+name);
			System.out.println("Percentage :"+ calPercentage());
			System.out.println("Grade : "+ calGrade());
				
		}
		
		
		
		public static void main(String[] args) {
			
			Student s1, s2;
			
			s1= new Student(101,"AMER",'M',false,223.22f);
			s2= new Student(101,"AMER",'M',false,23.22f);
			
			
			System.out.println(s1);
			System.out.println(s2);
		
			if(s1==s2)
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
			 if(s1.equals(s2))
			 {
				 System.out.println("equal");
			 }
			 else {
				 System.out.println("not");
				 
			 }
			 s1.printResult();
			 
		}


}
