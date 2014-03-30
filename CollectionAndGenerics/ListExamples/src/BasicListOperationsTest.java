import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class BasicListOperationsTest {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
        al.add("JAVA");
        al.add("C++");
        al.add("PERL");
        al.add("PHP");
        al.add(0, "Ruby");
        al.remove(3);
        al.remove("PHP");
        System.out.println(al);
        System.out.println("Element at index 1: "+al.get(1));
        System.out.println("Does list contains JAVA? "+al.contains("JAVA"));
        System.out.println("Is arraylist empty? "+al.isEmpty());
        System.out.println("Index of PERL is "+al.indexOf("C++"));
        System.out.println("Size of the arraylist is: "+al.size());
        
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
              
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("First");
        al2.add("Second");
        al2.add("Third");
        al2.add("Random");
        
        al2.addAll(0, al);
        System.out.println(al2);
        
        System.out.println("Does ArrayList contains all list elements?: "+al2.containsAll(al));
        
        String[] strArr = new String[al.size()];
        al.toArray(strArr);
        
        List<String> list = al2.subList(2, 4);
        System.out.println("Sub List: "+list);
        
        Collections.reverse(list);
        System.out.println("Reverse List: "+list);
        
        Collections.shuffle(al2);
        System.out.println(al2);
        
        Collections.swap(al2, 2, 5);
        System.out.println(al2);
        
        al2.clear();
	}

}
