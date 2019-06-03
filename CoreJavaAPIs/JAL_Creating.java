package CoreJavaAPIs;
import java.util.*;
 
public class JAL_Creating {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		
		ArrayList<String> list4 = new ArrayList<String>(); // Java Generics allow for the type specialization of each ArrayList
		ArrayList<String> list5 = new ArrayList<>();
		
		List<String> list6 = new ArrayList<>(); // Is allowed because ArrayList inherits properties of List
//		ArrayList<String> list7 = new List<>(); Cannot instantiate Interfaces.
		
	}
}
