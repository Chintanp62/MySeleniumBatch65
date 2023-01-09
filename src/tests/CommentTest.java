package tests;

public class CommentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testing = "Automation";
		System.out.println(testing);
		
		String tool = "Selenium";
		
		String space = " ";
	//single line comment	
		System.out.println(testing+tool);
		System.out.println(testing+" "+tool);
		System.out.println(testing+space+tool);
       //Multiple lines comment
      int a= 10;
       int b= 20;
       System.out.println(testing+tool+a+b);
	System.out.println(a+b+testing+tool);
	System.out.println(testing+tool+(a+b));

	}

}
