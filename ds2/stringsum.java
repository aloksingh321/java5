
import java.io.*;

class GFG {
    public static int abc(int n)
    {
        int y=0;
     if(n<=0)
     {
         return n;
     }
     else{
     int t=n%10;
        y=y+t;
       
       return  y+abc(n=n/10);
     }
     //return y;    
  }
    
	public static void main (String[] args) {
String s="12345";	    
int a[]={1,2,3,4,5};
 int r = Integer.parseInt(s);
	System.out.print(abc(foo));
	}
}