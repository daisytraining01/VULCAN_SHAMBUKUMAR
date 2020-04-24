package com.picnic.shambhukumarpashupati;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Question7 {
	public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String, String>();
	HashMap<String, String> map1 = new HashMap<String, String>();

	map.put("Key 1", "TestVal1");
	map.put("Key 2", "TestVal2");
	map.put("Key 3", "TestVal1");
	map.put("Key 4", "TestVal2");
	map.put("Key 5", "TestVal2");
	map.put("Key 6", "TestVal3");

	Set<String> keys = map.keySet(); // The set of keys in the map.
	Iterator<String> iterator = keys.iterator();
	while (iterator.hasNext()) {
		String key = iterator.next();
		String value = map.get(key);

		if (!map1.containsValue(value)) {
			map1.put(key, value);
		}
	}
	System.out.println(map1);

}
/*Output : 
{Key 1=TestVal1, Key 2=TestVal2, Key 6=TestVal3}
*/

}
