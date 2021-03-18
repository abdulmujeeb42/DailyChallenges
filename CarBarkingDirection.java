The program must accept an integer matrix of size R*C representing a multi-storey car parking lot. The integer O represents an empty slot and the integer 1 represents a car. The entry point is always present at the bottom night of the ground floor The way to reach the 1 floor is on the left side of the ground floor. The way to reach the 2nd floor is on the right side of the 1 floor. Similarly the ways to the remaining floors are present on the left side and night side alternatively. A person wants to park his car in the first occurring empty slot on or above the X floor. The value of X is also passed as the input The program must print Instructions he needs to follow to park his car as the output The instructions must be in the following formats -> L followed by an integer - It indicates that he needs to move k slots towards left -> R followed by an integer K it indicates that he needs to move k slots towards Right
U-It indicates that he needs to go to the next floor Note: At least one parking slot is always empty on or above the floor.
  
Input

5 7

1 0 0 0 0 0 0

1 1 0 0 1 1 0

0 1 1 0 1 1 0

1 1 1 1 1 1 1

1 1 1 1 1 1 1

3
output
L 7
U
R 7
U
L 7
U
R 3

EXPLANATION:
Here x=3 the first occuring empty dlot on the 3rd floor ids hghlighted below.
1 0 0 0 0 0 0       //4th floor

1 1 0 0 1 1 0     //3rd floor

0 1 1 0 1 1 0      //2nd floor

1 1 1 1 1 1 1     //first floor

1 1 1 1 1 1 1     //ground floor

The instruction to park his car are given below.
L 7
U
R 7
U
L 7
U
R 3

                          ************************************
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt(),c=sc.nextInt();
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++)
		    mat[i][j]=sc.nextInt();
		}
		int n=sc.nextInt(),k=0;
		while(k<n){
		    if(k%2==0)System.out.println("L "+c);
		    else System.out.println("R "+c);
		    System.out.println("U");
		    k++;
		}
		for(int i=r-n-1;i>=0;i--)
		{
		    if(i%2!=0&&r%2!=0||(i%2==0&&r%2==0)){
		        for(int j=0;j<c;j++)
		        {
		            if(mat[i][j]==0){
		                System.out.print("R "+(j+1));
		                System.exit(0);
		            }
		        }
		        System.out.println("R "+c);
		        System.out.println("U");
		    }
		    else{
		        for(int j=c-1;j>=0;j--)
		        {
		            if(mat[i][j]==0){
		                System.out.print("L "+(c-j));
		                System.exit(0);
		            }
		        }
		        System.out.println("L "+c);
		        System.out.println("U");
		    }
		    
		}

	}
}
