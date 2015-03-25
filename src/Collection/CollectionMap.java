package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CollectionMap {
	public static void main(String[] args) {
		
		Map<String,String> day = new HashMap<String,String>();
		day.put("Mo","Monday");
		day.put("Tu","Tuseday");
		day.put("Wed","Wednesday");
		day.put("Th","Thursday");
		day.put("Fri","Friday");
		day.put("Sat","Saturday");
		day.put("Sun","Sunday");
		

		for(Map.Entry<String ,String > entry : day.entrySet()){
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key);
		}
		
//		Iterator iterator = day.keySet().iterator();
//		while(iterator.hasNext()){
//		  Object key   = iterator.next();
//		  Object value = day.get(key);
//		  System.out.println(key);
//		}
//		
	}

}


