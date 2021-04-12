Fibanacci series- Reverse & sum

Example input/output 1:

Input:
11

Output:
0 1 1 2 3 5 8 13 39 124 514
  
Expanation:
Here N=11 and the first two terms are 0 ad 1.
The 3th term in the series is 1 (0+1)
The 4th term in the series is 1 (1+1)
The 5th term in the series is 1 (1+2)
The 6th term in the series is 1 (2+3)
The 7th term in the series is 1 (3+5)
The 8th term in the series is 1 (5+8)
The 9th term in the series is 1 (8+31)
The 10th term in the series is 1 (31+93)
The 11th term in the series is 1 (93+421)
  
Hence, the output is 
0 1 1 2 3 5 8 13 39 124 514

                                  ************************************************
import java.util.*;
public class Hello {
    static long Rev(long n){
        long rev=0;
        while(n!=0){
            long rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long t1=0,t2=1,nextTerm=0;
		for(int i=0;i<n;i++)
		{
		    System.out.print(t1+" ");
		    if(nextTerm<10)
		    nextTerm=t1+t2;
		    else nextTerm=Rev(t1)+Rev(t2);
		    t1=t2;
		    t2=nextTerm;
		}

	}
}
