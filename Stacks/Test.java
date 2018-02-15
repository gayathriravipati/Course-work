package Stacks;

public class Test {
	public static void main(String[] args)
	{
		StackInt si1=new StackInt();
		System.out.println("Stack top of si1 " + si1.getTop());
		System.out.println("Size of Array of si1:"+ si1.getArr().length);
		StackInt si2 = new StackInt(15);
		System.out.println("Size of Array of si2 :"+si2.getArr().length);
		si2.readArr(3);
		System.out.println("Pop value of si2 :"+si2.pop());
		si2.pop();
		System.out.println("Peek value of si2 :"+si2.peek());
		si2.pop();
		System.out.println("Top value of si2 :"+si2.getTop());
		si2.push(5);
		si2.push(10);
		si2.printArr();
		StackInt c=si2.copy();
		System.out.println("Duplicate Stack of si2");
		c.printArr();
		System.out.println("Checking Equality of c and si2 :" + c.equals(si2));
		System.out.println("Minimum Value of Stack of si2 :"+si2.getm());
		StackChar a=new StackChar(5);
		System.out.print("Reverse of an input String :");
		a.push('s');
		a.push('a');
		a.push('r');
		a.push('a');
		a.push('n');
		a.reverse();
		
		
	}
}
