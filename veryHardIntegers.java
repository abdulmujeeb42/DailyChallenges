The program must accept two integers N and H as the Input if the binary representation  integer contains 101.then it a hard integer The hardness of an integer H equal to the no of occurrences of 101 in binary representation. The program must print the number of integers from 1 to N having the hardness greater than or equal to to H as the input.

Input

50 1

Output

20

Explanation:

Here N = 50 and H = 1.

The integers having the hardness greater than or equal to 1 are given below.

5-> 101 -> H = 1

10 -> 1010 -> H = 1 

11 -> 1011 ->H= 1

13 -> 1101 ->H= 1

20 -> 10100 -> H 1

21 -> 10101 -> H 2

22 -> 10110 -> H 1

23 => 10111 -> H 1

26 -> 11010 -> H=1

27 -> 11011 H = 1

29 -> 11101 -> H = 1

37 - 100101 H1

40 -> 101000 -> H = 1

41 - 101001 - 1 H = 1

42  - 101010 -> H = 2

43 -> 101011-> H = 2

44 > 101100 -> H = 1

45- 101110- H=1

46- 101110 - H=1
  
47- 10111-> H=1
                           *******************************
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),h=sc.nextInt(),Hardness=0,FinHardness=0;
		for(int i=5;i<=n;i++)
		{
		    String bin=Integer.toBinaryString(i);
        Hardness=0;
		    for(int j=0;j<bin.length()-2;j++)
		    {
		        if(bin.charAt(j)=='1'&&bin.charAt(j+1)=='0'&&bin.charAt(j+2)=='1'){
		            Hardness++;
		            if(Hardness==h)FinHardness++;
		            if(Hardness>h)break;
		         }
		    }
		}
		System.out.print(FinHardness);

	}
}
