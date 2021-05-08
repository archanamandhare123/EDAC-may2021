import java.util.*;
 
 class Octal
 {
          public static void main(String args[])
		  {
		      int octal[]=new int[20];
			  
			  int index=0;
			  Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a Decimal number: ");
        int n=sc.nextInt();
        System.out.println("Octal number is : ");
			  //int n=16;
			  
			  while(n>0)
			  {
			    octal[index++]=n%8;
				
				n=n/8;
			  }
			  
			   for(int i=index-1;i>=0;i--)
				
			   {
				System.out.print(octal[i]);
			
			   }
				 
			  
		 }
 }