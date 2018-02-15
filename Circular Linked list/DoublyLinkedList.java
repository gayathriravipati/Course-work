

public class DoublyLinkedList {
	public DoubleNode head=null;
	public void insert_At_Head(int x)
	{
		DoubleNode newnode= new DoubleNode(x);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
		}
	}
	public void insert_At_Tail(int x)
	{
		DoubleNode newnode = new DoubleNode(x);
		if(head==null)
			head=newnode;
		else
		{
			DoubleNode temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newnode;
			newnode.prev=temp.next;
		}
	}
	public void delete_Value(int value)
	{
		DoubleNode temp=head;
		while(temp.data!=value)
		{
			temp=temp.next;
		}
		if(temp.next==null)
		{
			temp.prev.next=null;
			temp.prev=null;
		}
		else if(temp==head)
		{
			head=temp.next;
			temp.next.prev=null;
			temp.next=null;
		}
		else
		{
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
			temp.next=null;
			temp.prev=null;
		}
	}
	public void insert_At_Position(int value,int k)
	{
		DoubleNode temp=head;
		DoubleNode newnode = new DoubleNode(value);
		int count=1;
		if(k==1)
		{
			newnode.next=head;
			head=newnode;
		}
		else
		{
			while(count!=k-1)
			{
				temp=temp.next;
				count++;
			}
			if(temp.next==null)
			{
				newnode.prev=temp;
				temp.next=newnode;
			}
			else
			{
				newnode.next=temp.next;
				newnode.prev=temp;
				temp.next.prev=newnode;
				temp.next=newnode;
			}
		}
	}
	public void insert_After_Node(DoubleNode n,int x)
	{
		DoubleNode temp=head;
		DoubleNode newnode = new DoubleNode(x);
		while(temp.data!=n.data)
		{
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next.prev=newnode;
		newnode.prev=temp;
		temp.next=newnode;
	}	
	public void print()
	{
		DoubleNode temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data+" ");
		System.out.println();
	}
	public void reverse(int k)
	{
		DoubleNode temp = head;
		DoubleNode current=head;
		DoubleNode temp1=head;
		int c=1;
		while(c<=k)
		{
			temp1=temp1.next;
			c++;
		}
		temp = current.prev;
		current.prev = current.next;
		current.next = temp1;
		current=current.prev;
		c=2;
		while (c<=k) {
		    temp = current.prev;
		    current.prev = current.next;
		    current.next = temp;
		    current=current.prev;
		    c++;
		}
	       if(temp!=null)
	    	   head=temp.prev;
	}
}
        
