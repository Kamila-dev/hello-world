package ua.com.fozminded.helloworld;

public class HelloWorld {

	public static void main(String[] args) {

		int i = 6;
		int j = 7;
		float answer = (float)j / (float)i ;
		String StringAnswer ;
		

	
	String message = "Hello World!";
	
	
	StringAnswer = message + " " + answer;
	
	
	boolean isMoreThanOne;
	if(answer > 1) {
		isMoreThanOne = true;
	}else{
		isMoreThanOne = false;
	}
	
	
	
	System.out.println(message);

	System.out.println(StringAnswer + " " + isMoreThanOne); 	
	System.out.println("Passenger");
	}
	
	

}
