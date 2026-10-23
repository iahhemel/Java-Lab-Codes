import java.lang.*;
class Person{
    private String name;
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void displayInfo(){
        System.out.println("Name is: "+getName());
    }
}

 class Employee extends Person{
    protected int age;
     public void setAge(int age){
        this.age=age;
     }
      public int getAge(){
        return age;
      }
      public void displayInfo(){
		  System.out.println("Name is: "+getName());
        System.out.println("Age is: "+getAge());
      }
 }
  class Manager extends Employee{
    private String department;
    public void setDepartment(String dept){
        this.department=dept;
    }
    public String getDepartment(){
        return department;
    }
    public void displayInfo(){
		System.out.println("Name is: "+getName());
		System.out.println("Age is: "+getAge());
        System.out.println("Department is : "+getDepartment());
    }
  }
   public class Hemel{
    public static void main(String[] args) {
      Manager a = new Manager();
        a.setName("Martin");
        a.setAge(1515);
        a.setDepartment("cse");
        a.displayInfo();

        Employee b=new Employee();
        b.setName("Kamal");
        b.setAge(25);
        b.displayInfo();
    }
  
   }