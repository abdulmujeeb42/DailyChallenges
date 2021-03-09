Rearranging Integer Matrix - Alphaphets
                                                      ******************
Question and Sample input of this problem
The program must accept an integer matrix M1 and a character matrix M2 having the same size R*C as the input. 
The matrix M2 contains only lower case alphabets. The program must rearrange the integer matrix M1 based on 
the positions of the alphabets in M2 after sorting the alphabets. The integer value in M1 must be relocated 
to the original position (before sorting) of the alphabet in M2 in having the same position in the sorted 
matrix M2. If two or more alphabets are same, then the program must consider them in the order of their occurrence. 
Finally, the program must print the modified matrix M1 as the output. 
  Boundary Condition(s): 2 <= R, C <= 50 1 <= Matrix element value <= 1000 
  Input Format: The first line contains R and C separated by a space.
    The next R lines, each contains C integer values representing the integer matrix M1.
    The next R lines from the (R+2) line, each contains C alphabets representing the character matrix M2.
    Output Format: The first R lines, each contains C integers representing the modified matrix M1.

      
Example Input/Output 1:
Input: 
4 4 
66 58 42 85 
41 24 69 59 
80 67 50 89 
23 17 11 82
j y g e 
v w i b 
l f c p 
e n n r

Output: 
59 82 24 42 
17 11 69 66
80 41 58 89 
85 67 50 23
  
Explanation: The integers in the matrix M1 are given below.
66 58 42 85 
41 24 69 59 
80 67 50 89 
23 17 11 82 
The alphabets of M2 in alphabetical order after sorting are given below.
b c e e
f g i j
l n n p
r v w y
  1 integer 66 is placed in the b's position. 
  2 integer 58 is placed in the c's position. 
  3 integer 48 is placed in the e's position (first occurrence). 
  4 integer 85 is placed in the e's position (second occurrence).
  5 integer 41 is placed in the f's position. 
  6 integer 24 is placed in the g's position. 
  7 integer 69 is placed in the i's position. 
  8 integer 59 is placed in the j's position. 
  9 integer 80 is placed in the l's position. 
  10 integer 67 is placed in the n's position (first occurrence). 
  11 integer 50 is placed in the n's position (second occurrence). 
  12 integer 89 is placed in the p's position. 
  13 integer 23 is placed in the r's position. 
  14 integer 17 is placed in the v's position. 
  15 integer 11 is placed in the w's position. 
  16 integer 82 is placed in the y's position. 
  Now the matrix M1 becomes 
  
59 82 24 42 
17 11 69 66
80 41 58 89 
85 67 50 23
                                                            ********************
  
  
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt(),c=sc.nextInt();
		int[][] mat1=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    mat1[i][j]=sc.nextInt();
		}
		sc.nextLine();
		char[][] mat2=new char[r][c];
		char[] arr=new char[r*c];
		int index=0;
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        mat2[i][j]=sc.next().charAt(0);
		        arr[index++]=mat2[i][j];
		    }
		}
		Arrays.sort(arr);
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        int a=0;
		        for(int k=0;k<r*c;k++)
		        {
		            if(mat2[i][j]==arr[k])
		            {
		                arr[k]='*';
		                while(k>=c)
		                {
		                    k=k-c;
		                    a++;
		                }
		                System.out.print(mat1[a][k]+" ");
		                //System.out.print(a+""+k+" ");
		                break;
		            }
		        }
		    }
		    System.out.println();
		}

	}
}
