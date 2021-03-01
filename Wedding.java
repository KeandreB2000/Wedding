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
public class Wedding 
{
    private String weddingLocation;
    private LocalDate weddingDate;
    private Couple names;
    
    public Wedding(LocalDate weddingDate, String weddingLocation, Couple names)
    {
        this.names = names;
        this.weddingDate = weddingDate;
        this.weddingLocation = weddingLocation;
    }

    public Wedding(Couple names) 
    {
        this.names = names;
    }
    
    public LocalDate getweddingDate()
    {
        return weddingDate;
    }
    
    public Couple getnames()
    {
        return names;
    }
    
    public String getweddingLocation()
    {
        return weddingLocation;
    }
}
