/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwed;
import java.time.LocalDate;

/**
 *
 * @author keeskothemagician
 */
public class Person 
{
    private String firstName;        // variables for the class
    private String lastName;
    LocalDate birthDate;
    
    public Person(String firstName, String lastName, LocalDate birthDate)    // constructor 
    {
        this.firstName = firstName;    // variables inside of the constructor
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    
    public  String getfirstName()
    {
        return firstName;
    }
    
    public String getlastName()
    {
        return lastName;
    }
    
    public LocalDate getbirthDate()
    {
        return birthDate;
    }
}
