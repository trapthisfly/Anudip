// 3. Create a program to calculate the annual salary of an employee 
// by using inheritance. Create a class named "User" with the 
// following properties and methods: Properties: id(int): representing
// the id of the User name(String):representing the name of the User 
// Constructor: Declare parameterized constructor to initialize id and
// name. Create a subclass named "Employee" that inherits from the 
// "User" class. Add the following additional properties and methods: 
// Properties: salary(double):representing the monthly salary of the 
// employee Method: double calculateAnnualSalary():to calculate the 
// annual salary earned by the employee. In the main method, create an
// object of "Employee" class. Calculate the annual salary of the 
// employee and display it.. [Hint:Use constructor or setter methods 
// to set the value]

import java.util.Scanner;

/**
 * Salary
 */
public class Salary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee id: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Employee name:");
    String name = sc.nextLine();
    System.out.print("Enter Monthly salary of the employee: ");
    double salary = sc.nextDouble();
    Employee ep = new Employee(id, name, salary);
    double annual_salary = ep.calculateAnnualSalary();
    System.out.println("Annual Salary of "+name+" is : "+annual_salary);
  }
}
/**
 * User
 */
public class User {

  int id;
  String name;
  User(int id, String name){
    this.id = id;
    this.name = name;
  }
}
/**
 * Employee extends User
 */
public class Employee extends User {

  double salary;
  Employee(int id, String name, double salary){
    super(id, name);
    this.salary = salary;
  }
  double calculateAnnualSalary(){
    return (12 * this.salary);
  }
}
