package Queue;

public class QueueTest {
	public static void main(String[] args)
	{
		CircularQueueInt q=new CircularQueueInt(3);
		CircularQueueInt q1=new CircularQueueInt(4);
		int i=0;
		/*q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);*/
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(0);
		q1.enqueue(4);
		
		q1.print();
		q1.splitq();
		System.out.println("Minimum Element:"+q1.getminElement());
	//	q.print();
	//	System.out.println("Minimum Element"q.equals(q1));
	}
}
