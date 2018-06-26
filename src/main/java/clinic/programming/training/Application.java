package clinic.programming.training;

import java.util.*;

public class Application {
	public static void main(String [] args) {
		
		List<String> greets = new ArrayList<>();
		greets.add("Hello world !");
		
		for(String greet : greets) 
		
			System.out.println(greet);
	}	
}