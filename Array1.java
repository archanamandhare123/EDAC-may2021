import java.util.*;

class Array1
{
  public static void main(String args[])
  {
     int a1[]=new int[5];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the input:");
	 for(int i=0;i<=a1.length;i++)
		 
		 {
			 a1[i]= sc.nextInt();
		 }
	 
	 for(int i=0;i<=a1.length-1;i++)
	 
	 {
		  System.out.println(a1[i]+" ");
	 }
	  
  }
}

