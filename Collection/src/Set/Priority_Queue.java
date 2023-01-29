package Set;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		
		pq.add("R");
		pq.add("A");
		pq.add("W");
		pq.add("S");
		
		System.out.println(pq);
		
		// Insertion order is not maintained.
		// add, offer, remove, poll, element and peek
		
		// 1. Add
		pq.add("k");
		System.out.println(pq);
		pq.add("100");
		System.out.println(pq);
		
		// 2. Size
		pq.size();
		System.out.println(pq.size());
		
		// 3. isempty
		System.out.println(pq.isEmpty());
		
		// 4. contains 
		pq.contains("W");
		System.out.println(pq.contains("W"));
		
		// 5. remove 
		
		pq.remove();
		System.out.println(pq.remove("W"));
		System.out.println(pq);
		
		// 6. peek - It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		
		pq.peek();
		System.out.println("Peek method -  "+pq);
		
		
		
		// 7. poll -It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.

		
		pq.poll(); 
		System.out.println("Poll method -  "+pq);
		
		
		// 8. element() -	It is used to retrieves, but does not remove, the head of this queue.
		
		pq.element();
		System.out.println("Element method -  "+pq);

		
		// 9. Offer - It used to specified element in this queue.
		
		pq.offer("K");
		System.out.println(pq);
		
	}

}
