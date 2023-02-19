package app_java_2;

import java.util.Arrays;
//To find second highest no. in array.


public class D{  
	public static void main(String[] args) {
		
	
	int num[] = {79,89,47,68,1,2,-7,45,87,9};
	
	int n= num.length;
	//gives us length of array
	
	int highest =Integer.MIN_VALUE;
	int Secondhighest =Integer.MIN_VALUE;
	
	
	for(int i=0 ;i<n;i++) {
		if(num[i]>highest) {
			Secondhighest=highest;
			highest=num[i];
			
		}
		
		if(num[i]< highest && num[i]>Secondhighest) {
			
			Secondhighest=num[i];
		}
		
	}
      System.out.println("second highest number is" +Secondhighest);
}}