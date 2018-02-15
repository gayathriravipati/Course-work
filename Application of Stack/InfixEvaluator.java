package Stacks;
import java.util.Scanner;
public class InfixEvaluator 
{
	static int pow(int a,int b)
	{
		int r=1;
		for(int j=0;j<b;j++)
		{
			r=r*a;
		}
		return r;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Post Form:");
		String y =in.nextLine();
		int n = y.length();
		StackInt s=new StackInt(n);
		for(int i= 0;i<n;i++)
		{
			char x = y.charAt(i);
			if((x=='+') || (x=='-') || (x=='*') || (x=='/') || (x=='^'))
			{
				if(s.getTop()==-1)
					System.out.println("Stack is Empty");
				else
				{
					int b=s.pop();
					int a=s.pop();
					switch(x)
					{
						case '+': 
							s.push(a+b);
							break;
						case '-':
							s.push(a-b);
							break;
						case '*':
							s.push(a*b);
							break;
						case '/':
							s.push(a/b);
							break;
						case '^':
							s.push(pow(a,b));
							break;
						default:
							System.out.println("Invalid Character");
							break;
 					}
				}
			}
			else if(x==' ')
			{
				int o=0;
			}
			else
			{
				if(y.charAt(i+1)==' ')
				{
					s.push(Integer.parseInt(String.valueOf(x)));
				}
				else
				{
					int f=Integer.parseInt(String.valueOf(x));
					while(y.charAt(i+1)!=' ')
					{
						char t = y.charAt(i+1);
						f=f*10+Integer.parseInt(String.valueOf(t));
						i++;
					}
					s.push(f);
				}
					
			}
		}
		System.out.println("Value of Postfix form : "+s.peek());
	}
}