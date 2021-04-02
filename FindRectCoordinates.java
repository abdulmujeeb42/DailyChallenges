Any two co-ordinates of rectangle given as the input.The area of a rectangle also given as a input.you have to calculate another two co-ordinates of a rectangle.

Example Input1/Ouput1:

Input 
0 0 
0 5
30
Output
6 0
6 5
  
Explanation:
The length is 5.Area of the rectangle is 30. So the breadth of rectangle is 30/5=6.Based on the result another two co-ordinates are calculated.

                                             **************************************
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),RectArea=sc.nextInt(),Length=0;
		if(y1==y2){
		    Length=Math.abs(x1-x2);
		    System.out.println(x1+" "+(y1+RectArea/Length));
		    System.out.println(x2+" "+(y2+RectArea/Length));
		}
		else {
		    Length=Math.abs(y1-y2);
		    System.out.println((x1+RectArea/Length)+" "+y1);
		    System.out.println((x2+RectArea/Length)+" "+y2);
		}

	}
}
