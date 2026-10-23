//Multilevel Inheritance
//Person --> Employee --> Manager

import java.lang.*;

class Person  //parent class
{
    protected String name; // protected access modifier

    public void setName(String name) //setter method
	{
        this.name = name;
    }

    public String getName() //getter method
	{
        return name;
    }

    public void displayInfo()   
	{
        System.out.println("Person Name: " + name); 
    }
}

class Employee extends Person    //child class
{
    protected int employeeId;

    public void setEmployeeId(int id) 
	{
        this.employeeId = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void displayInfo()  // Overriding method
	{
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee 
{
    protected String department;

    public void setDepartment(String dept) 
	{
        this.department = dept;
    }

    public String getDepartment() {
        return department;
    }

    public void displayInfo()  // Overriding method
	{
        System.out.println("Manager Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class Multi  // Main class
{
    public static void main(String[] args) 
	{		
		Manager a = new Manager();
        a.setName("Martin");
        a.setEmployeeId(10);
        a.displayInfo();
		
        Manager b = new Manager();
        b.setName("Alice");
        b.setEmployeeId(101);
        b.setDepartment("Engineering");
        b.displayInfo();
    }
}
