Matrix - Nine Submatrices

The program must accept an integer matrix of size N*N as the input.The program must divide the given matric in to 9
submatrices based on the following conditions.
  
The program mutt divide the matix into four sunmatices of equal size
Then the program must divide the top-right subimatrices horizontally in two submatrices.
Then the program must divide the bottom-left subimatrices vertically in two submatrices.  
Then the program must divide the bottom-right into four submatrices of equal size.
 Finally the program must print sum of all the sub matrices as the output.

input Format

The first line contains N

The next N line each contain N integer seerated by a space

Output Format

sum of all the submatrices.

Example Input/output

Input
4
10 20 55 65
40 30 92 82
11 23 34 24
21 43 74 94
  
output
100 120 174 32 66 34 24 74 94
                                    **************************
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum1=0,sum2=0,sum3=0,sum4=0;
		int[][] mat=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        mat[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<n/2;i++)
		{
		    for(int j=0;j<n/2;j++)
		    sum1+=mat[i][j];
		}
		System.out.print(sum1+" ");
		sum1=0;sum2=0;
		for(int i=0;i<n/2;i++)
		{
		    for(int j=n/2;j<n;j++){
		        if(i<(n/4))sum1+=mat[i][j];
		        else sum2+=mat[i][j];
		    }
		}
		System.out.print(sum1+" "+sum2+" ");
		sum1=0;sum2=0;
		for(int i=0;i<n/2;i++)
		{
		    for(int j=n/2;j<n;j++)
		    {
		        if(i<n/4)sum1+=mat[j][i];
		        else sum2+=mat[j][i];
		    }
		}
		System.out.print(sum1+" "+sum2+" ");
		sum1=0;sum2=0;
		for(int i=n/2;i<n;i++)
		{
		    for(int j=n/2;j<n;j++)
		    {
		        if(i<(n/2+n/4)&&j<(n/2+n/4))sum1+=mat[i][j];
		        else if(i<(n/2+n/4)&&(j<n))sum2+=mat[i][j];
		        else if(i<n&&j<(n/2+n/4))sum3+=mat[i][j];
		        else sum4+=mat[i][j];
		    }
		}
		System.out.print(sum1+" "+sum2+" "+sum3+" "+sum4);

	}
}

                                         ***********************************
