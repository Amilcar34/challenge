package wrapper;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveIfChallenge {
  
  public static void main(String... dungeonsAndDragons){
	List<Integer> list = new ArrayList<>();
	
	list.add(22);
	list.add(12);
	list.add(14);
	list.add(128);
	
	Integer prestoAge = 14;
	Integer dungeonMasterAge = 128;
	
	list.removeIf(e -> e == new Integer(12) || 
		e == dungeonMasterAge || 
		e == prestoAge || 
		e.equals(new Integer(22)));
	
	System.out.println(list);
  }
  
  /**
   * Los desarrolladores de JDK crearon una regla para almacenar en caché los números enteros de -128 a 127. 
   * Eso significa que todas las variables creadas dentro de este rango se almacenarán en caché, 
   * lo que significa que no se creará un nuevo objeto en el montón de memoria.
   * 
   * Cuando usamos el operador '==', estamos comparando si la referencia del objeto apunta al mismo objeto.
   */
  
}