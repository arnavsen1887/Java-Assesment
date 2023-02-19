package app_java_2;

import java.util.Scanner;
//Reverse the given string
public class A {
	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}

