import java.util.*;

public class ArrayListItems{

  public static void main (String args[]){
  
    ArrayList lista = new ArrayList();

    for (int i = 0; i<3; i++)
      lista.add(new ItemsListing("ItemListening" + (i+1)));
    
    for (int i = 0; i<3; i++)
      lista.add(new ItemHijo("Item Hijo" + (i+1)));

    System.out.println(lista.get(3));

    Iterator it= lista.iterator();

    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}

//ItemListen1,ItemListen2,ItemListen3,ItemHijo1,ItemHijo2,ItemHijo3