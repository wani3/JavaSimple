package Collection;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
public static void main(String[] args) {
	HashMap<String ,String >hashMap = new HashMap<String ,String >();
	hashMap.put("net", "Net");
	hashMap.put("one", "One");
	hashMap.put("cherry", "Cherry");
	//hashMap.put(null, "aaCherry");
	
	System.out.println(hashMap.get("net"));
	System.out.println(hashMap.get("one"));
	System.out.println(hashMap.get("cherry"));
	//System.out.println(hashMap.get(null));
	
	
	for(Map.Entry<String ,String > entry : hashMap.entrySet()){
		String key = (String) entry.getKey();
		String value = (String) entry.getValue();
		System.out.println(key);
	}
}

}
