package rbTEst;

public class palindrome {
	public static void main(String[] args) {
		
	
 String str = "Rabbit", reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + "the string is a Palindrome.");
    }
    else {
      System.out.println(str + "the string is not a Palindrome");
    }
  }
	
	
}
