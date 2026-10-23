public class Main{
	public static void main(String args[]){
		Gender a = new Gender();
		Gender b= new Male();
		Gender c= new Female();
		
		 a.old();
		 b.old();
		 c.old();
		 
		 Calculation calc = new Calculation();
		 System.out.println(calc.b(2,5));
		  System.out.println(calc.b(2.3,5.7));
	}
}