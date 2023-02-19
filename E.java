package app_java_2;

import java.util.Scanner;
//CHeck no. is Armstrong or not

public class E {
	static{
	System.out.print("Enter the no.");}
public static void main(String[] args) {
	int n;
	
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
     
	
	int temp = n;
	int r , sum=0;
	while(n>0) {
		r=n%10;
		n=n/10;
		sum = sum + r*r*r;
			
	}
	if(temp==sum) {
		System.out.println("Its Armstrong no.");
	}
	else {
		System.out.println("its not a Armstrong no.");
	}
}
}
