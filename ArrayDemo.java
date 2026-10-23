import java.lang.*;

public class ArrayDemo
{
	public static void main(String []args)
	{
		//1st Approach
		int A[] = new int [5]; // array declaration
		A[0] = 10;
		A[3] = 20; 
		
	    for(int i=0; i<A.length; i++)  // A.length = size of the array; i<5.
		{
			System.out.println("A["+i+"]: "+A[i]);	
		}
		
		// Single line comment
		/* Multiple line
		comment */
		
		/* for(int value : A)     // for-each loop [updated version of for loop in Java]
		{
			System.out.println(value);
		} */
	
	  //2nd Approach
		
		int size = (A[3] / A[0]) + 2; // 2 + 2 = 4 [size]
		int B[] = new int [size];   // new int [4] --> 0 to 3
		
		B[0] = 11;
		B[1] = 22;
		B[2] = 33;
		B[3] = 44;
		
		for(int i=0; i<B.length; i++)
		{
			System.out.println("B["+i+"] : "+B[i]);	 
		}
		
		/* for(int value : B)
		{
			System.out.println(value);
		}*/
		
		//3rd Approach
		int C[] = new int []{1,2,3};     // C [0] = 1; C[1] = 2; C[2] = 3
		for(int i=0; i<C.length; i++)
		{
			System.out.println("C["+i+"] : "+C[i]);	
		}
		
	}
}