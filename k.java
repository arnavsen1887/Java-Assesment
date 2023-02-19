package app_java_2;

import java.util.ArrayList;
import java.util.HashSet;

//remove duplicate element from array
public class k {
public static void main(String[] args) {
	ArrayList<Integer> arr =new ArrayList<>();
	arr.add(10);
	arr.add(20);
	arr.add(10);
	arr.add(5);
	arr.add(30);
	arr.add(20);
	System.out.println(arr);
	HashSet<Integer> h = new HashSet<Integer>();
	
	for(int i=0;i<arr.size();i++)
	{
		h.add(arr.get(i));
	}
	System.out.println(h);
}
}
