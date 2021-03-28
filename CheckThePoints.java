The program must com e coordinatesix) of N points on a graph as the input The program mut print the number of points present inside the given rectangle as the output. The coordinates of the top-left and the bottom-right corner of the rectangle are

ed as the input

Boundary Condition(o) 2 N 100 -10 <-xy <= 10

Input Format

The first line contains N

The next Nines each contains two integers separated by a space The (N+2 ine contains four integers representing the coordinates of the toplant and the bottom-right corner of the rectangle

Output Format

The first line contains an integer representing the number of points present inside the g rectangle

Escample Input/Output 1

Input

22

41 13

43 72

2461

Output

3

Explanation

The coordinates of the top comer24

The coordinates of the bottom-right col = 6.1) There are 3 points pressure inside the rectang which are green belo





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
