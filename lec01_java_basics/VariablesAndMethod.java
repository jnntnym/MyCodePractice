package lec01_java_basics;

public class VariablesAndMethod {
									// class body contains: Variables, constructor and methods
	static int n1= 123;				// here int n1 is a static variable with static keyword, declared (out side of the main method) 										in a class body													
	static String str = "Jannat U Nayeem";		// if variable declared out side of the main method, it should be static 
												
	int n3 = 234; 					// if variable declared out side of the main method, it should be static, here error 													will show when will try to print
	
	
	public static void main(String[] args) {		// This is static main method, entry point of java
		
		// non static variables declared and initialized under main method 
		String str = "Jannat U Nayeem";
		int n2 = 123;
		char c = 'J';
		boolean b = true;

		// print non static variables under static main method
		System.out.println(str);
		System.out.println(n2);
		System.out.println(c);
		System.out.println(b);
		
		// print static variables under static main method 
		//	we can't declared/print the static variable under main method, it will shows error
		//	static int n1= 123;						//it will shows error
		//	static String str = "Jannat U Nayeem";	//it will shows error
		System.out.println("static int variable: "+n1);	
		System.out.println("static String variable: "+str);	
		//	System.out.println(n3);		// if variable declared out side of the main method, it should be static, here error 
		
	}
}
