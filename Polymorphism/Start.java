public class Start 
{
    public static void main(String[] args) 
	{
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); 
        myDog.makeSound();   
        myCat.makeSound();   

        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));     
        System.out.println(calc.add(2.5, 3.5));  
    }
}