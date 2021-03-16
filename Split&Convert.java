Getting a string input from the user then split the string in a length of 5. 
  Then change the all the upper characters to 1 and lowet characters to 0....then converting
  each string to decimal.
  dec=(0-25)=(a-z)
  

                                      **********************************
import java.util.*;
public class Hello {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] temp=new char[5];
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            temp[k]=s.charAt(i);
            if(k%5==4){
                for(int j=0;j<5;j++)
                {
                    if(Character.isUpperCase(temp[j]))
                    temp[j]='1';
                    if(Character.isLowerCase(temp[j]))
                    temp[j]='0';
                }
                //System.out.println(temp);
                String str=String.valueOf(temp);
                int dec=Integer.parseInt(str,2);
                if(dec<26){
                    System.out.print((char)(dec+97));
                }
                else if(dec==26)System.out.print(".");
                else if(dec==27)System.out.print(",");
                else if(dec==28)System.out.print(" ");
                else if(dec==29)System.out.print("?");
                else if(dec==30)System.out.print("'");
                else System.out.print('"');
                k=-1;
            }
            k++;
        }
    }
}
