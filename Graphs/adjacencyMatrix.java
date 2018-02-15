import java.util.*;
public class adjacencyMatrix
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v,e,x,y ;
		System.out.println("Enter the No. of vertices : ");
		v=in.nextInt();
		System.out.println("Enter the No. of edges : ");
		e=in.nextInt();
		int[][] a = new int[v][v] ;
		System.out.println("Enter edges : <to> <from> ");
		for(int i=0;i<e;i++)
		{
			x=in.nextInt();
			y=in.nextInt();
			a[x-1][y-1]=1;
		}
		System.out.println("Adjancency Matrix : ");
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	
	}
}