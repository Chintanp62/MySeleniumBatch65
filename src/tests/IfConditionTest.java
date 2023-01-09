package tests;

public class IfConditionTest {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		
		if (a==b) {
			System.out.println("a and b are equal");
		}else if(a<b){
			System.out.println("a is lesser than b");
			
		}else {
			System.out.println("a is greater than b");
		}
		String expected= "selenium";
		String actual= "selenium";
		if (expected.equals(actual)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
				

	}

}
