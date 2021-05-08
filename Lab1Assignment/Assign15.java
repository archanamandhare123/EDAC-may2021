import java.util.*;
class Assign15
{ 
public static void main(String args[])
{
 int temp;
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter first  no i=");
 int i=sc.nextInt();
  System.out.print("Enter Second  no j= ");
 int j=sc.nextInt();
 temp =i;
 i=j;
 j=temp;
 System.out.println("After Swapping:");
 System.out.println("i:"+i);
 System.out.println("j:"+j);
}
}
// output
// C:\test>java Assign15
// Enter first  no i=10
// Enter Second  no j= 20
// After Swapping:
// i:20
//j:10