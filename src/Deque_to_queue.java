import java.util.*;

public class Deque_to_queue {
   public static void main(String args[]) {
	   																	// create Deque object       
   Deque<Integer> deque = new ArrayDeque<Integer>(7);
      
   																		// populate the object
   deque.add(1);
   deque.add(2);
   deque.add(3);
   deque.add(4);
   deque.add(5);        
   deque.add(6);
   deque.add(7);
      
   															// get queue from the deque
   System.out.println(deque);
      
   System.out.println("View of the queue is: "+Collections.asLifoQueue(deque));
   }    
}