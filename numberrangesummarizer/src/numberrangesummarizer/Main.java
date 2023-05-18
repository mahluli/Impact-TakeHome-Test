package numberrangesummarizer;
import java.util.Collection;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
	    {
	        DemoNumberRangeSummarizer nr = new DemoNumberRangeSummarizer();
	        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
	        try {
	            Collection<Integer> collectionInput = (List<Integer>)nr.collect(input);
	            String range = nr.summarizeCollection(collectionInput);

	            System.out.println(range);
	        } catch (ClassCastException exc) {
	            System.out.println("Please review the string there might be a character");
	        }
	    

	}

}
