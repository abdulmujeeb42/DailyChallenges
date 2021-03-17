Given matrix having '-' and '*' suympol - represent land * represent the building. you will check the each buildings top-right top-left bottom-right bottom-left there is any land
is having you will builting in that...to increase the count of newbuildings.

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt(),c=sc.nextInt();
		char[][] mat=new char[r][c];
		for(int i=0;i<r;i++)
		{
		    sc.nextLine();
		    for(int j=0;j<c;j++)
		    {
		        mat[i][j]=sc.next().charAt(0);
		    }
		}
		int NewBuildings=0;
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        if(mat[i][j]=='*'){
		        if(i!=0&&j!=c-1){
		            if(mat[i-1][j+1]=='-'){
		            NewBuildings++;
		            mat[i-1][j+1]='#';
		            }
		        }
		        if(i!=0&&j!=0){
		            if(mat[i-1][j-1]=='-'){
		            NewBuildings++;
		            mat[i-1][j-1]='#';
		            }
		        }
		        if(j!=0&&i!=r-1){
		            if(mat[i+1][j-1]=='-'){
		            NewBuildings++;
		            mat[i+1][j-1]='#';
		            }
		        }
		        if(i!=r-1&&j!=c-1){
		            if(mat[i+1][j+1]=='-'){
		            NewBuildings++;
		            mat[i+1][j+1]='#';
		            }
		        }
		        }
		    }
		}
		System.out.print(NewBuildings);

	}
}
