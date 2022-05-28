/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int n=Integer.parseInt(args[0]);
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int k=n-1;k>=i;k--)
	        {
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i*2;j++)
	        {
	           if(j%2!=0)
	            System.out.print("*");
	            else
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	    
	    System.out.println();
	    
	    for(int i=n;i>=1;i--)
	    {
	        for(int k=i;k<=n-1;k++)
	        {
	            System.out.print(" ");
	        }
	        for(int j=i*2;j>=1;j--)
	        {
	            if(j%2!=0)
	            System.out.print("*");
	            else
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
}

