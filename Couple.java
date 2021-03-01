/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwed;

/**
 *
 * @author keeskothemagician
 */
public class Couple 
{
    Person wife;
    Person husband;  
    
    public Couple(Person personwife, Person personhusband)
    {
        this.wife = personwife;
        this.husband = personhusband;
    }
    
    public Person getwife()
    {
        return wife;
    }    
    
    public Person gethusband()
    {
        return husband;
    }
}
