
A matrix of size Rit containing positive integer values is passed as the input An integer value which s a multiple of S is a bomb and destroy our adjacent cells in the following order left right top and bottom. But if the adjacent cell is water the integer value will be a multiple of 3), then the bomb will stop destroying the adjacent cels Ha cell is destroyed then the value of that all oeccines 0 After the bomb blasted the the delle esimees Ole the cell value both multiple and then consider that as water Finally the cream must in the Values in the atrix 35 the sun


Bample Input/Output 1:

Input

33

555 61 20

1

156 10

Output 000

C00

15 60

Explanation

After the bomb 10 in the last row is triggered the left value is 6 and is water So the explosion stops Hence the matrix state is

555

61 20

15 60

Now 15 s both a multiple of 5 and 3. Hence it is considered as wa

in the 2nd row from the bottom 20 is a bomb and it destroys the left cell with right cell with the top cal

with 5. The bottom cell water and hence remains unchanged. Hence the matro state is

505

000

15 60

TH the 3 row from the bottom two bombs with the values 5) explode and hence the fira state is

400

900

15 60



import java.util.*;
public class Hello {  
    static int r,c;
    static int[][] mat=new int[100][100];
    static int isValidBomb(int n)
    {
        if(n%5==0&&n%3!=0)return 1;
        else return 0;
    }
    static int isNotWater(int row,int col)
    {
        if(row<=r-1&&col<=c-1&&row>=0&&col>=0)
        {
            if(mat[row][col]%3==0) return 0;
            else return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();c=sc.nextInt();
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        mat[i][j]=sc.nextInt();
		    }
		}
		for(int i=r-1;i>=0;i--)
		{
		    for(int j=c-1;j>=0;j--)
		    {
		        if(isValidBomb(mat[i][j])==1)
		        {
		            mat[i][j]=0;
		            if(isNotWater(i,j-1)==1)
		            mat[i][j-1]=0;
		            else if(isNotWater(i,j-1)==0) continue;
		            if(isNotWater(i,j+1)==1)
		            mat[i][j+1]=0;
		            else if(isNotWater(i,j+1)==0)
		            continue;
		            if(isNotWater(i-1,j)==1)
		            mat[i-1][j]=0;
		            else if(isNotWater(i-1,j)==0)
		            continue;
		            if(isNotWater(i+1,j)==1)
		            mat[i+1][j]=0;
		            else if(isNotWater(i+1,j)==0)
		            continue;
		        }
		    }
		}
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
		
		

	}
}
