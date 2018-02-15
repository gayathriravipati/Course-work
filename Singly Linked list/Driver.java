
public class Driver {
	public static void main(String[] args) {
		SingleLinkedList ob1 = new SingleLinkedList();
		ob1.insert_At_Head(90);
		ob1.print();
		ob1.insert_At_Head(10);
		ob1.insert_At_Head(50);
		ob1.print();
		ob1.insert_At_Tail(20);
		ob1.insert_At_Tail(32);
		ob1.print();
		System.out.print("Inserting 5 at position 3 : ");
		ob1.insert_At_position(5,3);
		ob1.print();
		System.out.print("Deleting a node at position 2 : ");
		ob1.delete_At_Position(2);
		ob1.print();
		System.out.print("Deleting a node which has value 50 :");
		ob1.delete_A_Value(50);
		ob1.print();
		int y=ob1.no_Of_Nodes();
		System.out.print("No. of Nodes: "+y);
		int x = ob1.sum();
		System.out.println("Sum of elements of the Nodes: " +x);
		System.out.print("Changing the data field of 2 node with 100 : ");
		ob1.value_Node(100, 2);
		ob1.print();
		ob1.move_Largest();
		System.out.print("Moving the largest element Node to end of the list: ");
		ob1.print();		
		System.out.print("Search a Node with data field 20 in the linked list :");
		ob1.search_Value(20);
		System.out.print("Search a Node with data field 120 in the linked list :");
		ob1.search_Value(120);
		SingleLinkedList ob2 = new SingleLinkedList();
		ob2.insert_At_Tail(1);
		ob2.insert_At_Tail(10);
		ob2.insert_At_Tail(20);
		ob2.insert_At_Tail(52);
		ob2.insert_At_Tail(0);
		System.out.print("SingleLinkedList 1 : ");
		ob1.print();
		System.out.print("SingleLinkedList 2 : ");
		ob2.print();
		System.out.print("Concatenating Linked List 1&2: ");
		ob1.concatenate(ob2);
		ob1.print();
		ob1.delete_Even_Elements();
		System.out.print("Deleting even elements in a linked list: ");
		ob1.print();
		System.out.print("Reversing a singly linked list using Iteration : ");
		SingleLinkedList ob3 = new SingleLinkedList();
		ob3.head= ob1.reverseIteratively();
		ob3.print();
		System.out.print("ob3 : ");
		ob3.print();
		System.out.print("Reversing ob3 singly linked list using Recursion : ");
		SingleLinkedList ob4 = new SingleLinkedList();
		ob4.head= ob3.reverseRecursively(ob3.head);
		ob4.print();
		System.out.print("ob1 : ");
		ob1.print();
		System.out.println("Splitting a ob1 linked list into two lists so that all elements in odd positions are in one list and those in even positions are in another list: ");
		ob1.splitList(ob1);


		LinkedStack s = new LinkedStack();
		s.push(5);
		s.push(10);
		s.push(20);
		s.pop();
		System.out.print("Stack: ");
		s.display();
		System.out.println("Pop Element: "+s.pop());
		System.out.println("Top Element: "+s.getPeek());

		LinkedQueue q = new LinkedQueue();
		System.out.println("Queue is Empty: "+q.isEmpty());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		q.enqueue(50);
		q.enqueue(70);
		q.enqueue(10);
		System.out.print("Queue: ");
		q.display();
		System.out.println("Queue is Empty: "+q.isEmpty());
		System.out.println("Front Element: "+q.getFront());
	}
}

	
