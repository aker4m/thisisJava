package chap13.Exercise;

public class Util {
	public static <K, V> V getValue(Pair<K, V> pair, K key){
		if(pair.getKey().equals(key)){
			V v = pair.getValue();
			return v;
		}
		return null;
	}
}
