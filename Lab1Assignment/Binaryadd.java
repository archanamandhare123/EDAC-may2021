import java.util.*;

class Binaryadd
{
    public static void main(String args[])
	{ 
	     Scanner s =new Scanner(System.in);
		 System.out.println("Enter First Number");
		 String x=s.next();
		 System.out.println(" Enter Second Number");
		 String y=s.next();
		 int n1=Integer.parseInt(x,2);
		 int n2= Integer.parseInt(y,2);
		 
		 
		 int n3=n1+n2;
		 
		 System.out.println("n1:"+Integer.toBinaryString(n1));
		 System.out.println("n1:"+Integer.toBinaryString(n2));
		 System.out.println("n3=n1+n2:"+Integer.toBinaryString(n3));
	    
	}
}