package app_java_2;

public class J {
	 //java program to find frequency of each element in array
	    public static void main(String[] args) {  
	         
	        int [] arr = new int [] {10, 20, 80, 30, 20, 20, 20, 50, 10 ,50 ,30 ,80};  
	      
	        int [] fr = new int [arr.length];  
	        int visited = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                     
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  
	                fr[i] = count;  
	        }  
	  
	       
	        System.out.println("---------------------------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------");  
	        for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
	        }  
	        System.out.println("----------------------------------------");  
	    }}  

