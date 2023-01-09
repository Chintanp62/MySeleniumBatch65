 package tests;

import selenium.Test4;

public class Test1 {
		
		static Test1 t1= new Test1();
		static Test2 t2= new Test2();
		static Test3 t3 = new Test3 ();
		static Test4 t4 = new Test4();
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main method");
		printme();
		System.out.println("After print me");
		scanme();
		 t1.paintme();
		 t1.testme();
		 Test2.blue();
		 t2.red();
		 Test3.square();
		 t3.circle();
		 Test4.abc();
		 t4.xyz();
		 ArguementsTest.sum(100,200);
	}
    public static void scanme() {
    	System.out.println("Scanme");
    }
    public Test1() {
    	System.out.println("Who is this constructor");
    }
	public static void printme() {
		System.out.println("Printme");
	}
	public void paintme() {
		System.out.println("Paintme");}
		public void testme() {
			System.out.println("Testme");}
			
			
			
		
	}

