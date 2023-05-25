package rbTEst;

public class array {

	 public static void main(String[] args) {      
         
	        //Initialize array   
	        int [] arr = new int [] {1, 1, 1, 2, 3, 4, 5, 8, 5, 6, 3, 5, 6};   
	        int temp=0;
	        System.out.println("non Duplicate elements in given array: ");  
	         
	        for(int i = 0; i < arr.length; i++) {
	        	
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(temp == arr [j]) 
	                {
	                		 temp=arr[i];
	                		
	                }
	                System.out.println(temp);
                	 	   	     
	            }  
	        }  
	    }  
}
