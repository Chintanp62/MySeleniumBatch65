package tests;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub, 
		String tools[]={"Selenium", "Java", "Junit","TestNG", "Maven"};
		System.out.println(tools.length);
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);
		

		
		System.out.println("----------------");
		for(int i = 0; i<tools.length; i++) {
			System.out.println(tools[i]);
		}

	}

}
