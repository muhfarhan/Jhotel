
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusKamar
{
    Booked("Booked"),Processed("Processed"),Vacant("Vacant");
    private String stat;
    
    public String toString()
    {
        return stat;
    }
    
    StatusKamar(String stat)
    {
        this.stat = stat;
    }
    
    public String stat()
    {
        return stat;
    }
}
