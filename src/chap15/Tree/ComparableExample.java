package chap15.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args){
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("hong", 45));
		treeSet.add(new Person("kim", 25));
		treeSet.add(new Person("park", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()){
			Person person = iterator.next();
			System.out.println(person.name+" : "+person.age);
		}
	}
}
