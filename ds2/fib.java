

import java.io.*;
import java.util.Scanner;
class GFG {
    static int s[] =new int[100]; 
    static public  int f(int n)
    {
        if(n<=1)
        {
            return n;
        }
        if(s[n]!=-1)
        {
           return s[n];    
        }
    s[n]=f(n-1)+f(n-2);
      return s[n];
    
        }
	public static void main (String[] args) {
	   Scanner obj =new Scanner(System.in); 
	   int i,n;
	    for(i=0;i<100;i++)
	    {
	       s[i]=-1; 
	    }
	    n=obj.nextInt();
		System.out.print(f(n));
	}
}