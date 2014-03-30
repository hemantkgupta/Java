import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListOperationsTest {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Orange");
        linkedList.add("Apple");
        linkedList.add("Grape");
        linkedList.add("Banana");
        System.out.println(linkedList);
        System.out.println("Size of the linked list: "+linkedList.size());
        System.out.println("Is LinkedList empty? "+linkedList.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? "+linkedList.contains("Grape"));
        linkedList.addFirst("Mango");
        linkedList.removeLast();
        LinkedList<String> copy = (LinkedList<String>) linkedList.clone();
        System.out.println(copy);
        
        System.out.println("First Element: "+linkedList.element());
        System.out.println("First Element: "+linkedList.getFirst());
        System.out.println("First Element: "+linkedList.peek());
        System.out.println("First Element: "+linkedList.peekFirst());
        
        Iterator<String> itr = linkedList.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        // stack operation
        System.out.println("Stack operations");
        linkedList.push("push element");
        System.out.println("After push operation:");
        System.out.println(linkedList);
        linkedList.pop();
        System.out.println("After pop operation:");
        System.out.println(linkedList);
        
        // Queue operation
        System.out.println("Queue operations");
        linkedList.add("add element");
        System.out.println("After add operation:");
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println("After remove operation:");
        System.out.println(linkedList);
        
        // another set of queue operations
        System.out.println("Another set of queue operations");
        linkedList.offer("offer element");
        System.out.println("After offer operation:");
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println("After poll operation:");
        System.out.println(linkedList);
        
        
        
	}

}
