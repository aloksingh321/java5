	import java.util.Scanner;
	class Array
	{ 
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++)
		{
		  a[i]=sc.nextInt();
		}
		System.out.println("Array is:-")
		for(int i=0;i<n;i++)
		{
		   System.out.println(a[i]);
		}
		
	}
}