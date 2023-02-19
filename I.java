package app_java_2;

public class I {
	// Java Program to Separate the
	// Individual Characters from a String

	
		public static void main(String[] args)
		{

			String str = "Arnav's programing assesment";

		
			System.out.println(
				"Individual characters from given string: ");

			
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}



