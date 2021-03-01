/*
 *Provide constructors for each class that accept parameters for each field, and provide get methods for each field. 
 *Then write a program that creates two Wedding objects and in turn passes each to a method that displays all the details. 
 */
package testwed;        

import java.time.LocalDate;    // import the packages needed for the program 
import java.time.Month;
/**
 *date 2/8/21
 * @author keeskothemagician
 */
public class TestWed 
{

    public static void main(String[] args) 
    {
        Person personhusband = new Person("Keesko The " , "Magician", LocalDate.of(2000, Month.OCTOBER, 16));   // insertting my data for the class
        Person personwife = new Person("Megan The ", "Stallion", LocalDate.of(2000, Month.MARCH, 1));
        Couple couplenames = new Couple(personwife, personhusband);
        Wedding weddingObject = new Wedding(LocalDate.of(2030, Month.MARCH, 23), "Hawaii", couplenames);  
        
        Person personhusband2 = new Person("Keesko The" , "Magician", LocalDate.of(2000, Month.OCTOBER, 16));  // insertting my data for the class
        Person personwife2 = new Person("Megan The", "Stallion", LocalDate.of(2000, Month.MARCH, 1));
        Couple couplenames2 = new Couple(personwife2, personhusband2);
        Wedding weddingObject2 = new Wedding(LocalDate.of(2030, Month.MARCH, 23), "Hawaii", couplenames2);
        
                
                
        displayWeddingDetails(weddingObject);        // displays my object
        displayWeddingDetails(weddingObject2);      
    }
    
    public static void displayWeddingDetails(Wedding w)
    {
        System.out.println("\nWedding details: ");
        System.out.println("*******************");
        System.out.println("Wife's name: " + w.getnames().getwife().getfirstName() + w.getnames().getwife().getlastName() + " DOB: " + w.getnames().getwife().getbirthDate());
        System.out.println("Husband's name: " + w.getnames().gethusband().getfirstName() + w.getnames().gethusband().getlastName() + " DOB: " + w.getnames().gethusband().getbirthDate());
        System.out.println("Wedding Date: " + w.getweddingDate());
        System.out.println("Wedding Location: " + w.getweddingLocation());
    
    }
            
}
