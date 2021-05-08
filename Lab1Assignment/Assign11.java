import java.util.*;
 
class Assign11
 {
    public static void main(String[] args)
    {
        
		 float pi=3.1415f,area, perimeter;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Radius of circle:");
		 float i= sc.nextFloat();
	       area = pi * i *i;
		   perimeter=2*pi*i;
		 {
	        System.out.println("Area of the circle:"+area);
			System.out.println("Perimeter of the circle:"+perimeter);
			
		   
		 }	
        
    }
}

// output
//C:\test>java Assign10
//Enter Radius of circle: 7.5

//Area of the circle:176.70938
//Perimeter of the circle:47.1225