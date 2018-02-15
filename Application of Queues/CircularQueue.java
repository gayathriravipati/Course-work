package Truck;

public class CircularQueue {
	int[] arr = new int[5];
	int front = -1;
	int rear = -1;
	CircularQueue(){
		arr = new int[10];
		front = -1;
		rear = -1;
	}
	CircularQueue(int sz){
		arr = new int[sz];
		front = -1;
		rear = -1;
	}
	public void print(){
		if(front==-1&&rear==-1){
			System.out.println("Queue Empty");
		}
		else{
			if(front>rear){
				for(int i=front;i<arr.length;i++){
					System.out.println(this.arr[i]);
				}
				for(int i=0;i<=rear;i++){
					System.out.println(this.arr[i]);
				}
			}
			else{
				for(int i=front;i<=rear;i++){
					System.out.println(this.arr[i]);
				}
			}
		}
	}
	public void enqueue(int item){
		if(front == (rear+1)%arr.length){
			System.out.println("Queue Full cannot enqueue");
		}
		else{
			if(front==-1&&rear==-1){
				front=0;
				rear=0;
			}
			else{
				rear = (rear+1)%arr.length;
			}
			arr[rear]=item;
		}
	}
	public int getFront(){
		return arr[front];
	}
	public int dequeue(){
		if(front==-1&&rear==-1){
			System.out.println("Queue empty");
			return 0;
		}
		else{
			int temp = arr[front];
			if(front==0 && rear==0){
				front=-1;
				rear=-1;
			}
			else{
				front = (front +1)%arr.length;
			}
			return temp;
		}
	}
}
