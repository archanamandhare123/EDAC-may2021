/*

                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/
class AssPyramid4
{
	public static void main(String[] args)
	{
	   for(int i=1;i<=9;i++)
	   {
			for(int j=1;j<=(9-i);j++)
			{
			System.out.print("  ");
			}
		    for(int k=1;k<=i;k++)
			{
			System.out.print(k+" ");
			}
			for(int m=i-1;m>=1;m--)
			{
			System.out.print(m+" ");
			}
			System.out.println();
	    }
	}
}