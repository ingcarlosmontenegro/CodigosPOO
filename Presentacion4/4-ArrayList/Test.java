import java.util.ArrayList;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		
		// Se anade en la ultima posicion de la lista
		myArrayList.add(2);
		myArrayList.add(3);

		for (Integer num : myArrayList)
        {
            System.out.println(num);
          
        }
		  System.out.println("---------");
		  
		//Se anade en una posicion especifica
		myArrayList.add(0, 1);
		myArrayList.add(3, 4);
		
		 for (Integer num : myArrayList)
	        {
	            System.out.println(num);
	            System.out.println(myArrayList.size());
	        }
		

	}

}
