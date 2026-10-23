import java.lang.*;

public class StringDemo 
{
	public static void main(String []args)
	{
		String s1 = "Bangladesh";
		String s2 = "Bangladesh";
		String s3 = new String("Messi"); // string object
		String s4 = new String("Barcelona"); // string object
		
		s1.compareTo(s2); //String Method
		if(s1==s2)
		{
			System.out.println("it is eqaul");
		}
		else { System.out.println("it is not equal");}
		
		System.out.println(s1.length()); //String Method
		System.out.println(s1.substring(2,4)); //String Method
		System.out.println(s1.charAt(2)); //String Method
		
		s3.compareTo(s4); //String Method
		if(s3==s4)
		{
			System.out.println("it is eqaul");
		}
		else { System.out.println("it is not equal");}
	}
}

// Complete this code using the given requirements:::
// 1. Use String type array.
/* 2. Make sure that,
One index of the array is used for the one string variable. 
Similarly, 
other indices are used for the specific string varibales.
*/
/* 3. Then, apply compareTo(), substring(),
concat (), toUpperCase (), equals() */