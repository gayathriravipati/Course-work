public class SingleLinkedList
{
	public Node head = null;
	public void insert_At_Head(int x)
	{
		Node newnode = new Node(x);
		if(head==null)
			head=newnode;
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	public void print()
	{
		if(head==null)
			System.out.println("Empty List");
		else
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public void insert_At_Tail(int value)
	{
		Node newnode = new Node(value);
		if(head==null)
			head=newnode;
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	public void insert_At_position(int value,int k)
	{
		Node temp=head;
		Node newnode = new Node(value);
		int count=1;
		while(count!=k-1)
		{
			temp=temp.next;
			count++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	public void delete_At_Position(int k)
	{
		Node temp=head;
		int count=1;
		while(count!=k-1)
		{
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
	}
	public void delete_A_Value(int value)
	{
		Node temp = head;
		if(temp.data==value)
				head=head.next;
		else
		{
			while(temp.next.data!=value)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
	}
	public int no_Of_Nodes()
	{
		Node temp = head;
		int count=1;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count-1;
	}
	public int sum()
	{
		Node temp = head;
		int sum=head.data;
		while(temp.next!=null)
		{
			temp=temp.next;
			sum=sum+temp.data;
		}
		return sum;
	}
	public void value_Node(int value,int k)
	{
		Node temp = head;
		int count=1;
		while(count<k)
		{
			temp=temp.next;
			count++;
		}
		temp.data=value;
	}
	public void move_Largest()
	{
		Node temp = head;
		int x=temp.data;
		int count=1;
		int y=0;
		while(temp.next!=null)
		{
			if(x<temp.data)
			{
				x=temp.data;
				y=count;
			}
			temp=temp.next;
			count++;
		}
		temp=head;
		count=1;
		while(count!=y-1)
		{
			temp=temp.next;
			count++;
		}
		Node temp1;
		temp1=temp.next;
		temp.next=temp.next.next;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=temp1;
		temp1.next=null;
	}
	public void search_Value(int value)
	{
		Node temp=head;
		int x=1;
		int flag=1;
		while(temp.next!=null)
		{
			if(temp.data==value)
			{
				System.out.println("Found at position "+x);
				flag=0;
			}
			temp=temp.next;
			x++;
		}
		if(flag==1)
			System.out.println("Not Found");
	}
	public void delete_Even_Elements()
	{
		Node temp=head;
		int count=0;
		while(temp.next!=null)
		{
			if((count%2) == 0)
				temp.next=temp.next.next;
			else
				temp=temp.next;
			count++;
		}
	}
	public void concatenate(SingleLinkedList x)
	{
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=  x.head;
	}
	public void splitList(SingleLinkedList s)
	{
		SingleLinkedList s1 = new SingleLinkedList();
		SingleLinkedList s2 = new SingleLinkedList();
		Node temp=head.next.next;
		s1.head =new Node(head.data);
		s2.head=new Node(head.next.data);
		Node temp1=s1.head;
		Node temp2=s2.head;
		int count =1;
		while(temp!=null)
		{
			if(count%2 != 0)
			{
				Node newnode = new Node(temp.data);
				temp1.next=newnode;
				temp1=temp1.next;
			}
			else
			{
				Node n = new Node(temp.data);
				temp2.next=n;
				temp2=temp2.next;
			}
			temp=temp.next;
			count++;
		}
		s1.print();
		s2.print();
	}
	public Node reverseIteratively()
	{
		Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
	}
  	public Node reverseRecursively(Node x)
  	{
   		Node newhead;
   		if(x.next == null)
   			return x;
   		newhead = reverseRecursively(x.next);
   		x.next.next=x;
   		x.next=null;
   		return newhead;
   	}
}
