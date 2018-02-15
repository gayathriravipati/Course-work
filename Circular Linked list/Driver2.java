
public class Driver2 {
	public static void main(String[] args) {
		DoublyLinkedList ob1 = new DoublyLinkedList();
		ob1.insert_At_Head(5);
		ob1.insert_At_Head(15);
		ob1.insert_At_Head(25);
		ob1.insert_At_Tail(4);
		ob1.insert_At_Tail(2);
		System.out.print("DoublyLinkedList: ");
		ob1.print();
		System.out.print("Inserting 10 in position 3: ");
		ob1.insert_At_Position(10,3);
		ob1.print();
		System.out.print("Inserting 3 after a node with value 4 : ");
		DoubleNode n= new DoubleNode(4);
		ob1.insert_After_Node(n,3);
		ob1.print();
		System.out.print("Deleting a node with value 10: ");
		ob1.delete_Value(10);
		ob1.print();
		ob1.reverse(3);
		ob1.print();

	}

}
