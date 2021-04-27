Split String - Equal Unique Count

Solved By 30 Users

The program must accept a string S as the input. The program must print the number of ways to split the string S into two parts so that the number of unique characters in both parts are equal

Example Input/Output 1:

Input:

acaddabac

Output:

2

Explanation:

All possible ways to split the string acaddabac are given below.

a caddabac

ac addabac

aca ddabac

acad dabac

acadd abac-> Same number of unique characters

acadda bac-> Same number of unique characters

acaddab ac

acaddaba c

Hence the output is 2.




import java.util.*;
public class Hello {
    static int UniqueCharCount(String s)
    {
        int unique=0;
        int[] freq=new int[s.length()];
        char string[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            freq[i]=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(string[i]==string[j]){
                string[j]='0';
                freq[i]++;
                }
            }
        }
        for(int i=0;i<freq.length;i++)
        {
            if(string[i]!=' '&&string[i]!='0'){
                unique++;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count1=0,count2=0,EqualUnique=0;
		for(int i=0;i<str.length()-1;i++)
		{
		    count1=0;count2=0;
		    String sub=str.substring(0,i+1);
		    count1=UniqueCharCount(sub);
		    String rem=str.substring(i+1,str.length());
		    count2=UniqueCharCount(rem);
		    //System.out.println(sub+" "+rem);
		    if(count1==count2)EqualUnique++;
		}
		System.out.print(EqualUnique);

	}
}
