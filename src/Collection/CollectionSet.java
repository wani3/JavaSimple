package Collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		
		Set<String> day = new HashSet<String>();
		day.add(new String("Monday"));
		day.add(new String("Tuseday"));
		day.add(new String("Wednesday"));
		day.add(new String("Thursday"));
		day.add(new String("Friday"));
		day.add(new String("Saturday"));
		day.add(new String("Sunday"));
		
//		Iterator iterator = day.iterator();
//		while(iterator.hasNext()){
//		  String element = (String) iterator.next();
//		  System.out.println(element);
		 //System.out.println(iterator.next());----->print เลย
//		}
		for(Object object : day) {
		    String element = (String) object;
		    System.out.println(element);
		}
//		for (Iterator<String> it = day.iterator(); it.hasNext(); ) {
//			  System.out.println(it.next());
//			}
//		
		
		
	}

}
