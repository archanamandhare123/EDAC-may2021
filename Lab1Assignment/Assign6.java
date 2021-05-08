import java.util.*;
 
class Assign6
 {
    public static void main(String[] args)
    {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First number:");
		int i = sc.nextInt();
		System.out.print("Enter Second number:");
		int j= sc.nextInt();
		
		int k = i+j;
		 System.out.println("Addition = " + k);
		
		int l=i-j;
		System.out.println("Subtraction = " + l);
		
		int m =i*j;
		System.out.println("Multipliaction = " + m);
		
		int n =i/j;
		System.out.println("Division = " + n);
		
		int o =i%j;
		System.out.println("Remainder = " + o);
        
    }
}

// Output:
//C:\test>java Assign6
//Enter First number:125
//Enter Second number:24
//Addition = 149
//Subtraction = 101
//Multipliaction = 3000
//Division = 5
//Remainder = 5