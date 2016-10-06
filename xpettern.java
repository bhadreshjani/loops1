
public class xpettern {
	public static void main(String args[])
	{
		int n=8;
for(int i=0;i<n;i++)        //outer main loop create n no of lines column
{
	System.out.print(i);

	for(int j=0;j<n;j++)  // loop will print raws 
	{
	
		if(j==i || j==(n-i-1))      //decide to print * or - 
		{
			System.out.print("*");			
		}
		else
		{
			System.out.print("_");
		}
	}
	System.out.print("\n");    // move control to next line
}
	
	}
}