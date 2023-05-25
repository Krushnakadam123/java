package rbTEst;

public class Primenumber {
    
		 public static void main(String args[]){    
//			 {		
//			      int i =0;
//			      int num =0;
//			      //Empty String
//			      String  primeNumbers = "";
//			     
//			      for ( i = 1; i <= 11; i++)  	   
//			      { 		 		  
//			         int counter=0; 		  
//			         for(num =i; num>=1; num--)
//			         {
//				    if(i%num==0)
//				    {
//					counter = counter + 1;
//				    }
//				 }
//				 if (counter ==2)
//				 {
//				    //Appended the Prime number to the String
//				    primeNumbers = primeNumbers + i + " ";
//				 }	
//			      }	
//			      System.out.println("Prime numbers from 1 to 11 are :");
//			      System.out.println(primeNumbers);
//			   }
//			}
//		 
			 
			 
			int n=20;
			boolean flag=false;
			for(int j=0;j<=10;j++) {
			for(int i=2;i<=n /2;i++) {
				if(j%i==0) {
					flag=false;
					break;
				}
			}
			if(!flag) {
				System.out.println(j+"is prime no");
			}else
			{
				System.out.println(j+"is not prime no");
			}
		 }
		 }
		 
}