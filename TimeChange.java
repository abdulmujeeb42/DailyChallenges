import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int a[]=new int[3];
		int[] t=new int[3];
		for(int i=0;i<3;i++)
		{
	    	t[i]=scan.nextInt();
	    	a[i]=Integer.parseInt(s.split(":")[i]);
		}
	
		for(int i=0;i<3;i++)
		{
		    if(i==0)
		    {
		        a[i]+=t[i];
		    }
		    else if(i==1)
		    {
		        a[i]+=t[i];
		        a[0]+=a[i]/60;
		        a[i]%=60;
		    }
		    else
		    {
		        a[i]+=t[i];
		        a[1]+=a[i]/60;
		        a[i]%=60;
		        
		        a[0]+=a[1]/60;
		        a[1]%=60;
		    }
		    a[0]%=24;
		    System.out.println(String.format("%02d",a[0])+":"+
		    String.format("%02d",a[1])+":"+
		    String.format("%02d",a[2]));
		}

	}
}
