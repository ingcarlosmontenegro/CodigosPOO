import java.util.*;


public class TestHashSet {

	public static void main(String[] args) {
	HashSet<String> hashSet = new HashSet<String>();
	
	hashSet.add("Uno");
	hashSet.add("Dos");
	for (String string : hashSet) {	
		System.out.println(string);
		
	}
	System.out.println(hashSet.size());
	System.out.println("----------");
	
	// aqui solo anadiria un solo elemento porque son iguales
	hashSet.clear();
	hashSet.add("Uno");
	hashSet.add("Uno");
	for (String string : hashSet) {	
		System.out.println(string);
		System.out.println(hashSet.size());
	}
	
	
	}
}
