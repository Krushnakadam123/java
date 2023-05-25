package rbTEst;


	import java.util.ArrayList;
	import java.util.List;

	public class ConcurrentModificationExample {
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("apple");
	        list.add("banana");
	        list.add("orange");

	        for (String fruit : list) {
	        
	            System.out.println(list.add("sdjgf"));
	        	}
	       // System.out.println(list);
	        }
	    	 
	    
	

}
