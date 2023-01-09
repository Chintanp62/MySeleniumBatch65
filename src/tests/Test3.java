 package tests;

public class Test3 {
	
	 static Test3 t3= new Test3();
	 static Test1 t1= new Test1();
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square();
		t3.circle();
		Test1.printme();
		t1.testme();

	}
	public static void square() {
		System.out.println("Square");
	}
    public void circle() {
    	System.out.println("circle");
    	
    }
}
