import java.util.Map;
import java.util.TreeMap;

public class TreeMapOperationsTest {

	public static void main(String[] args) {

		TreeMap<String, String> hm = new TreeMap<String, String>();
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		hm.put("java", "language");
		hm.put("computer", "machine");
		hm.put("india", "country");
		hm.put("mango", "fruit");
		hm.put("game", "cricket");

		System.out.println(hm);
		System.out.println("Value of second: " + hm.get("second"));
		System.out.println("Is TreeMap empty? " + hm.isEmpty());
		hm.remove("third");
		System.out.println(hm);
		System.out.println("Size of the TreeMap: " + hm.size());
		
		// will include game but not java
		Map<String, String> subMap1 = hm.subMap("game", "java");
		System.out.println("Sub-Map enties:");
		System.out.println(subMap1);
		
		//To get lower boundary also part of sub-map
        Map<String, String> subMap2 = hm.subMap("game", true, "java", true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap2);
        
        //To omit upper boundary in the sub-map
        Map<String, String> subMap3 = hm.subMap("game", false, "java", true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap3);
        
        System.out.println(hm.firstEntry());
        
        Map<String, String> rm = hm.descendingMap();
        System.out.println("Reverse Map Content: ");
        System.out.println(rm);
                

	}

}
