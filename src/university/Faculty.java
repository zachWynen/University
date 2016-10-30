/**
 * Subclass of Employee
 */
package university;

public class Faculty extends Employee{
 //Variable declaration
 String department;    
    
 public void Staff(String name, int salary, String departmentName)    
 {
  //Refuses to accept changed parameters, tries to referecence a constructor with no arguments. 
  //Unsure how to fix
  super(name, salary);
  department = departmentName;        
 }
 
 /**
  * Setter method
  * pre: An initialized Object with valid variables
  * post: A new Department replacing the previous one
  */
 public void setDepartment(String newDepartment)
 {
  department = newDepartment;   
 }
 
  /**
  * Getter method
  * pre: An initialized Object with valid variables
  * post: A returned value representing the String of the Faculty's Department
  */
 public String getDepartment()
 {
  return(department);   
 }   
}
