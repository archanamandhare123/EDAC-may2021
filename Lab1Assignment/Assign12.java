import java.util.*;
 
class Assign12
 {
    public static void main(String[] args)
    {
        
		 int sum,val;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter First Number:");
		 int i =sc.nextInt();
		 System.out.print("Enter Second Number:");
		 int j= sc.nextInt();
		 System.out.print("Enter Third Number:");
		 int k= sc.nextInt();
	       
	       
		  {
		   sum = i+j+k; 
		   val = sum/2;
	      }	
        System.out.println("Average of two number:"+val);
    }
}

// output
//C:\test>java Assign12
//Enter First Number:10
//Enter Second Number:30
//Enter Third Number:40
//Average of two number:40