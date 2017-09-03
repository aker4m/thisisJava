package chap15.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args){
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim", 85);
		map.put("lee", 90);
		map.put("park", 80);
		map.put("lee", 95);
		System.out.println("총 Entry 수 : "+map.size());
		
		System.out.println("\tlee : "+map.get("lee"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()){
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.remove("lee");
		System.out.println("총 Entry 수 : "+map.size());
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()){
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
	}
}
