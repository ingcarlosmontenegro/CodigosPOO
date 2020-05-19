import java.util.*;



public class TestHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1,"Numero uno");
		hashMap.put(2,"Numero 2");
		hashMap.put(3,"Numero 3");

		Iterator it = hashMap.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
		for (Map.Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
