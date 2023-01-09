package tests;

public class ArguementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(7,8);
		sum(100, 200);
		sum(1,2,3);
		sum(100, 1000, 2000);
		

	}
	public static void sum() {
		int a= 4+5;
		System.out.println(a);
		
	}
    public static void sum(int b, int c) {
     int a = b+c;
     System.out.println(a);
    }
    public static void sum(int b, int c, int d) {
    	int a=b+c+d;
    	System.out.println(a);
    	
    }
}
