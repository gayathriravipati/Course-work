package Truck;
import java.util.Scanner;
public class DriverTruck {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		CircularQueue petrol = new CircularQueue(no);
		CircularQueue distance = new CircularQueue(no);
		for(int i=0;i<no;i++){
			int p = s.nextInt();
			petrol.enqueue(p);
			int d = s.nextInt();
			distance.enqueue(d);
		}
		int leftpetrol =0;
		int index=0;
		int flag=2;
		first: for(int i=0;i<no;i++){
			second: for(int j=0;j<no;j++){
				leftpetrol = petrol.getFront() - distance.getFront();
				if(leftpetrol<0){
					flag = 0;
					break second; 
				}
				else{
					flag = 1;
				}
			}
			index = i;
			if(flag==1){
				break first;
			}
			petrol.front = (petrol.front+1)%no;
			distance.front = (distance.front+1)%no;
			petrol.rear = (petrol.rear+1)%no;
			distance.rear = (distance.rear+1)%no;
			
		}
		System.out.println(index);
	}
}
