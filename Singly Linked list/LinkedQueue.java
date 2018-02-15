public class LinkedQueue
{
	Node front=null;
	Node rear=null;
	int size=0;
	public LinkedQueue()
	{
		front=null;
		rear=null;
		size=0;
	}
	public boolean isEmpty()
	{
		return front==null;
	}
	public void enqueue(int value)
	{
		Node n = new Node(value);
		if(front==null && rear==null)
		{
			front=n;
			rear=n;
		}
		else
		{
			rear.next=n;
			rear=rear.next;
		}
		size++;
	}
	public int dequeue()
	{
		if(front==null && rear==null)
		{
			System.out.println("Queue is Empty");
			return 0;
		}
		else
		{
			int y=front.data;
			front = front.next;
			size--;
			return y;
		}
	}
	public int getFront()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty");
			return 0;
		}
		else
			return front.data;
	}
	public void display()
	{
		if(front== null && rear==null)
			System.out.println("Queue is Empty");
		else
		{
			Node temp=front;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}

}