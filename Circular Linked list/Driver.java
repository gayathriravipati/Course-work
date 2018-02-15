package CircularLinkedList;

public class Driver {

	public static void main(String[] args) {
		CircularLinkedList ob1=new CircularLinkedList();
		ob1.insert_At_Head(5);
		ob1.insert_At_Head(15);
		ob1.insert_At_Head(75);
		ob1.insert_At_Tail(4);
		System.out.println("CircularLinkedList: ");
		ob1.print();
		System.out.print("Inserting 55 at head: ");
		ob1.insert_At_Head(55);
		ob1.print();
		ob1.insert_At_Tail(2);
		System.out.print("Inserting 2 at tail: ");
		ob1.print();
		Node n = new Node(15);
		ob1.insert_After_Node(n,1);
		System.out.print("Inserting 1 after node with value 15 : ");
		ob1.print();
		System.out.print("Deleting a node with value 5 : ");
		ob1.delete_A_Value(5);
		ob1.print();
		System.out.print("Deleting the node in position 4 : ");
		ob1.delete_At_Position(4);
		ob1.print();
		
		
		CircularLinkedList ob2=new CircularLinkedList();
		ob2.insert_At_Head(50);
		ob2.insert_At_Head(60);
		ob2.insert_At_Head(70);
		ob2.insert_At_Tail(40);
		ob2.insert_At_Tail(30);
		System.out.print("CircularLinkedList1: ");
		ob1.print();
		System.out.print("CircularLinkedList2: ");
		ob2.print();
		System.out.print("Merging CircularLinkedList2 with 1: ");
		ob1.merge(ob2);
		ob1.print();

	}

}
