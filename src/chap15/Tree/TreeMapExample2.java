package chap15.Tree;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args){
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "hong");
		scores.put(new Integer(98), "lee");
		scores.put(new Integer(75), "park");
		scores.put(new Integer(95), "shin");
		scores.put(new Integer(80), "kim");
		
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet){
			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
		}
		System.out.println();
		
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet){
			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
		}
	}
}
