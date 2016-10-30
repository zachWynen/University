/**
 * Subclass of Employee
 */
package university;

public class Staff extends Employee{
 //variable initialization
 String jobTitle;    
 
 /**
  * Constructor Method
  * Pre: none
  * Post: An initialized Staff Object
  */
 public void Staff(String name, int salary, String job)    
 {
  //Refuses to accept changed parameters, tries to referecence a constructor with no arguments. 
  //Unsure how to fix
  super(name, salary);
  jobTitle = job;        
 }
 
 /**
  * Setter method
  * pre: An initialized Object with valid variables
  * post: A new Title replacing the previous one
  */
 public void setTitle(String newTitle)
 {
  jobTitle = newTitle;   
 }
 
 /**
  * Getter method
  * pre: An initialized Object with valid variables
  * post: A returned value representing the String of the Staff's Title
  */
 public String getTitle()
 {
  return(jobTitle);   
 }
}
