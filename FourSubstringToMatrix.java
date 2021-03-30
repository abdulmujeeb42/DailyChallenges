Four Substrings to Matrix

The program must accept N string values of equal length L as the input. The program must divide each string into four substrings of equal length. Then the program must form a character matrix of size R C where R = (N*3) and C = (L/4)*3. Then the program must fill the character matrix based on the following conditions.

The top-left top-right bottom left, bottom-right and middle submatrices of size (R/3)*(C/3) must be filled with the asteristks. 
 
The top middle submatrix of size (R/3)*(C/3)  must be filled with the 1 substrings of the N string values

The middle night submatrix of size (R/3) (C/3) must be filled with the 2 substrings of the N string values.
  
Tie bottom middle submatrix of size (R/3)*(C/3) must be filled with the 3 substrings of the N string values.

The middle-let submätrik of size (R/31 (C/3) must be filled with the substrings of the N string values.
                                  
Finally the pragrammaticaracter matrix as the output. 
                                 
Note: The value is always divisible by 4.
                                  
 Example Input/output1:
  
Input:
                                  
4                                
abcdefghijklmnop
ABCDEFGHUKLMNOP
1234567891011121
zyxwvutsrqponmlk

Output
****abcd****
****ABCD****
****1234****
****zyxw****
mnop****efgh
MNOP****EFGH
1121****5678
nmlk****vuts
****ijkl****
****IJKL****
****9101****
****rqpo****

Explanation

Here N = 4 and L = 16

The size of the character matrix to be formed is 12*12 (where R = 43 and C = (16/4)*3). Then the matrix is filled with the characters based on the given conditions.



                                   *************************************
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
		    str[i]=sc.next();
		    //System.out.println(str[i]);
		}
		int len=str[0].length(),r=(n*3),c=(len/4)*3,size=((r/3)*(c/3))/n,k=0;
		for(int i=0;i<n;i++)
		{
		    k=0;
		    for(int j=0;j<size*3;j++)
		    {
		        if(j<size)System.out.print("*");
		        else if(j>=size+size)System.out.print("*");
		        else {
		            System.out.print(str[i].charAt(k));
		            k++;
		        }
		        
		    }
		    System.out.println();
		}
		int x=len-size,y=size;
		for(int i=0;i<n;i++)
		{
		    x=len-size;y=size;
		    for(int j=0;j<size*3;j++)
		    {
		        if(j<size){
		            System.out.print(str[i].charAt(x));
		            x++;
		        }
		        else if(j>=size+size){
		            System.out.print(str[i].charAt(y));
		            y++;
		        }
		        else System.out.print("*");
		    }
		    System.out.println();
		}
		k=size+size;
		for(int i=0;i<n;i++)
		{
		    k=size+size;
		    for(int j=0;j<size*3;j++)
		    {
		        if(j<size)System.out.print("*");
		        else if(j>=size+size)System.out.print("*");
		        else{
		            System.out.print(str[i].charAt(k));
		            k++;
		        }
		    }
		    System.out.println();
		}

	}
}
