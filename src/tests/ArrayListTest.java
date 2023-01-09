package tests;

import java.util.ArrayList;

public class ArrayListTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tools= new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Java");
		tools.add("Junit");
		tools.add("TestNG");
		tools.add("Agile");
		
	
		
		System.out.println(tools.size());
		System.out.println(tools.get(2));
		 tools.add("Git");
		 System.out.println(tools.get(4));
		 System.out.println(tools.get(5));
		 
		 tools.remove(2);
		 System.out.println(tools.get(2));
		 
		 System.out.println("--------------");
		 
		 for(int i=0;i<tools.size();i++ ) {
			 System.out.println(tools.get(i));
			 
		 }
		 
	}

}
