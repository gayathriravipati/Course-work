public class LinkedStack
{
	Node top= null;
	int size=0;
	public LinkedStack()
	{
		top=null;
		size=0;
	}
	public void push(int x)
	{
		Node n = new Node(x);
		if(top==null)
			top=n;
		else
		{
			n.next = top;
			top=n;
		}
		size++;
	}
	public int pop()
	{
		if(top==null)
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
		{
			size--;
			int y=top.data;
			top=top.next;
			return y;
		}

	}
	public void display()
	{
		if(size==0)
			System.out.print("Stack is Empty");
		else
		{
			Node temp=top;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public int getTop()
	{
		return size;
	}
	public int getPeek()
	{
		if(size<=0)
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
		{
			int y=top.data;
			return y;
		}
	}
}