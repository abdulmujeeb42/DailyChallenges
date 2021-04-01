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
