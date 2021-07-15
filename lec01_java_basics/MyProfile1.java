package lec01_java_basics;

public class MyProfile1 {
	
	String 	MyName	= "Nayeem";
	int 	myAge	= 123;
	char 	mySex	= 'M';
	boolean usaCitizen = false;
	byte 	myExp	= 5;
	short	carIns 	= 200;
	long 	mySalary= 123456l;
	float 	myGrade	= 3.25f;
	double 	myHeight= 1.234567;

	
	public MyProfile1() { 		// Constructor declared
		System.out.println("This is default Constructor declared");
		
	}
	
	public void myProfile1() {	// method implemented
		System.out.println("My name is :"+MyName+ "\n"+"Age is :"+myAge+"\n"+"Sex is :"+mySex+"\n"+ "USA Citizen :"+usaCitizen+"\n"+"Experiance :"+myExp+ "\n"+"Car Ins :"+carIns+ "\n"+"Salary is :"+mySalary+ "\n"+ "Grade is :"+myGrade+"\n"+"Height is :"+myHeight);
		
	}

}
