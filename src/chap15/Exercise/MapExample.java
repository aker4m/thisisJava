package chap15.Exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			totalScore += map.get(key);
			if(maxScore<map.get(key)){
				name = key;
				maxScore = map.get(key);
			}
		}
		System.out.println("avg : "+totalScore/map.size());
		System.out.println("max : "+maxScore);
		System.out.println("maxScore id : "+name);
	}
}
