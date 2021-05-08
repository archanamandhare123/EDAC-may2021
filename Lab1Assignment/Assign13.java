import java.util.Scanner;

public class Assign13
{
    public static void main(String[] args) 
    {
        float l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width of rectangle:");
        l = s.nextFloat();
        System.out.print("Enter height of rectangle:");
        b = s.nextFloat();
        area = l * b;
        System.out.println("Area of rectangle:"+area);
		perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
    }
}