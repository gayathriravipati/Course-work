package Queue;

public class CircularQueueInt {
	int front =-1,rear=-1;
	int[] a = new int[5];
	CircularQueueInt()
	{
		a=new int[10];
		front=-1;
		rear=-1;
	}
	CircularQueueInt(int n)
	{
		a = new int[n];
		front=-1;
		rear=-1;
	}
	public void print()
	{
		if((front==-1) && (rear==-1))
			System.out.println("Queue is empty");
		if (front>rear)
		{
			for(int i=0;i<=rear;i++)
				System.out.print(a[i]+" ");
			for(int i=front;i<a.length;i++)
				System.out.print(a[i]+" ");			
		}
		else
		{
			for(int i=front;i<=rear;i++)
				System.out.print(a[i]+" ");
		}
	}
	public void enqueue(int x)
	{
		if(front==((rear+1)%a.length))
			System.out.println("Can't Enqueue");
		else
		{
			if(rear==(a.length-1))
			{
				front=((rear+1)%a.length);
				a[front]=x;
			}
			else if((rear==-1)&& (front==-1))
			{
				rear=0;
				front=0;
				a[rear]=x;
			}
			else
			{
				rear=rear+1;
				a[rear]=x;
			}

		}
	}
	public int getFront()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty");
			return 0;
		}
		else
			return a[front];
	}
	public void dequeue()
	{
		if((front==-1)&& (rear==-1))
			System.out.println("Can't Pop");
		else if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			if(front==(a.length-1))
				front=0;
			else
				front++;
		}
	}
	public boolean equals(CircularQueueInt x)
	{
		int flag=1;
		if((this.front==x.front) && (this.rear==x.rear))
		{
			if(front>rear)
			{
				for(int i=0;i<=rear;i++)
				{
					if(this.a[i]!=x.a[i])
						flag=0;
				}
				for(int i=front;i<a.length;i++)
				{
					if(this.a[i]!=x.a[i])
						flag=0;
				}
			}
			else
			{
				for(int i=front;i<=rear;i++)
					if(this.a[i]!=x.a[i])
						flag=0;
			}				
			if(flag==0)
				return false;
			else
			{
				return true;
			}
		}
		else
			return false;
	}
	public int getminElement()
	{
		int m=this.a[front];
		if(this.front>this.rear)
		{
			for(int i=0;i<=rear;i++)
			{
				if(m>this.a[i])
					m=a[i];
			}
			for(int i= front;i<=a.length-1;i++)
			{
				if(m>this.a[i])
					m=a[i];
			}
			return m;
		}
		else
		{
			for(int i= front;i<=rear;i++)
			{
				if(m>this.a[i])
					m=a[i];
			}
			return m;	
		}	
	}
	public void splitq()
	{
		int[] odd=new int[a.length/2];
		int[] even=new int[a.length/2];
		int j=0,k=0;
		if(front>rear)
		{
			for(int i=0;i<=rear;i++)
			{
				if((i%2)==0)
				{
					odd[j]=this.a[i];
					j++;
				}
				if((i%2!=0))
				{
					even[k]=this.a[i];
					k++;
				}			
			}
			for(int i=front;i<a.length;i++)
			{
				if((i%2)==0)
				{
					odd[j]=this.a[i];
					j++;
				}
				if((i%2!=0))
				{
					even[k]=this.a[i];
					k++;
				}		
			}
			System.out.println("Queue which contains elements in odd positions:");
			for(int i=0;i<j;i++)
				System.out.print(odd[i]+" ");
			System.out.println();
			System.out.println("Queue which contains elements in even positions:");
			for(int i=0;i<k;i++)
				System.out.print(even[i]+" ");	
			System.out.println();
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				if((i%2)==0)
				{
					odd[j]=this.a[i];
					j++;
				}
				if((i%2)!=0)
				{
					even[k]=this.a[i];
					k++;
				}		
			}
			System.out.println("Queue which contains elements in odd positions:");
			for(int i=0;i<j;i++)
				System.out.print(odd[i]+" ");
			System.out.println();
			System.out.println("Queue which contains elements in even positions:");
			for(int i=0;i<k;i++)
				System.out.print(even[i]+" ");	
			System.out.println();
		}
	}

}

