package Stacks;

public class Test2 {

	public static void main(String[] args) {
		StackInt a= new StackInt(5);
		StackInt b=new StackInt(4);
		for(int i=0;i<5;i++)
		{
			a.push(0);
		}
		for(int i=0;i<4;i++)
		{
			b.push(10+i);
		}
		int n=a.getTop()+b.getTop()+2;
		int[] arr = new int[n];
		for(int i=a.getTop();0<i;i--)
		{
			arr[i]=a.pop();
			
		}
		for(int i=n-1;i!=a.getTop();i--)
			arr[i]=b.pop();
		System.out.println("2 Stacks in a single array:");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}
