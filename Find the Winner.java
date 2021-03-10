Find the Winner
- The team that wins more rounds than the other team is the winner of the game. - If both teams win the same number of rounds, the team with the most points wins the game. - If both teams win the same number of rounds and have the same number of points, then the result of the last round is considered. The program must print the output based on the following conditions. - If team A wins the game, then print the string value "Team A". - If team B wins the game, then print the string value "Team B". - If the result is a tie, then print the string value "TIE".
Boundary Condition(s): 1 <= N <= 100
  
Input Format: 
The first line contains N. The next N lines, each contains two integers representing the points scored by the teams A and B. 
  
Output Format: 
The first line contains a string value based on the given conditions.
Example Input/Output 1:

Input: 
  10
  18 14 
  10 17 
  13 16 
  15 17 
  12 11 
  17 12 
  11 11 
  16 10 
  19 15 
  11 13 
  Output: Team A Explanation: The team A wins the rounds 1, 5, 6, 8 and 9. The team B wins the rounds 2, 3, 4, and 10. The team A wins more rounds than the     team B. Hence the output is Team A


                                      **********************
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] teamA=new int[n],teamB=new int[n];
		for(int i=0;i<n;i++)
		{
		    teamA[i]=sc.nextInt();
		    teamB[i]=sc.nextInt();
		}
		int winA=0,winB=0,pointA=0,pointB=0;
		for(int i=0;i<n;i++)
		{
		    if(teamA[i]>teamB[i])
		    winA++;
		    if(teamB[i]>teamA[i])
		    winB++;
		}
		//System.out.print(winA+""+winB);
		if(winA>winB)
		System.out.print("Team A");
		else if(winB>winA)
		System.out.print("Team B");
		else{
		    for(int i=0;i<n;i++)
		    {
		       pointA+=teamA[i];
		       pointB+=teamB[i];
		    }
		    //System.out.print(pointA+""+pointB);
		    if(pointA>pointB)System.out.print("Team A");
		    else if(pointB>pointA) System.out.print("Team B");
		    else System.out.print("TIE");
		}
		
		

	}
}


                                            ****************************
