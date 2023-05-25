package rbTEst;

import java.util.Scanner;

public class Aarry {
//public static void main(String[] args) {
//	int[] a= {1,2,10,5,7,4};
//	
//	int min=a[0];
//	for (int i=0;i<a.length;i++) {
//		if(a[i]<min) 
//			min=a[i];
//			
//		
//	}System.out.println(min);
//	 }
//	
	
	
	// Find the nth element of the array
	
	
	public static void main(String[] args) {
		 int[] arr = {3,5,6,8,10};                         // Line 1
//		  Scanner sc = new Scanner(System.in);              // Line 2
//		  System.out.println("Enter the nth position");     // Line 3
//		  int n = sc.nextInt();                             // Line 4
		 int n=3;
		 if(n<= arr.length){                               // Line 5
		    int element = arr[n-1];                         // Line 6
		   System.out.println(element);                      // Line 7
		 }                     
		   else {
		   System.out.println("Enter any position upto" + arr.length) ;//Line 8
		      }
	}
}
