/**
 *  Superclass of Staff and Faculty
 */
package university;

public class Employee 
{
 //Variable Declaration    
 String empName;
 int salary; 
 
 /**
  * Constructor Method 
  * pre: none
  * post: An initialized Employee class with related parameters
  */
 public void Employee(String name, int money)
 {
  empName = name;
  salary = money;
 }
 
 /**
  * Setter Method 
  * pre: An initialized Object with valid variables
  * post: A new Name replacing the first one
  */
 public void setName(String newName)
 {
  empName = newName;   
 }
    
 /**
  * Getter method
  * pre: An initialized Object with valid variables
  * post: A returned value representing the String of the Employee's Name
  */
 public String getName()
 {
  return(empName);   
 }
 
/**
  * Setter Method 
  * pre: An initialized Object with valid variables
  * post: A new Salary replacing the previous one
  */
 public void setSalary(int newSalary)
 {
  salary = newSalary;   
 }
 
 /**
  * Getter method
  * pre: An initialized Object with valid variables
  * post: A returned value representing the String of the Employee's Salary
  */
 public int getSalary()
 {
  return(salary);   
 }
}
