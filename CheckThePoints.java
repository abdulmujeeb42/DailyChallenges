The program must accept the coordinates(x,y) of N points on a graph as the input The program must print the number of points present inside the given rectangle as the output. The coordinates of the top-left and the bottom-right corner of the rectangle are passed as the input


Example Input/Output 1

Input
5

2 2
4 1 
1 3
4 3 
7 2
	
2 4 6 1

Output

3

Explanation

The coordinates of the top corner=(2,4)

The coordinates of the bottom-right corner =(6,1) 
	
There are 3 points pressure inside the rectang which are green below
(2,2), (4,1) and (4,3)



                         ********************************
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0;
		int[] a1=new int[n],a2=new int[n];
		for(int i=0;i<n;i++)
		{
		    a1[i]=sc.nextInt();
		    a2[i]=sc.nextInt();
		}
		int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    if(a1[i]>=x1&&a1[i]<=x2&&a2[i]>=y2&&a2[i]<=y1)
		    count++;
		}
		System.out.print(count);
		

	}
}
