package jhotel;

/**
 * Enumeration class StatusKamar -  berisi status-status kamar pada JHotel
 *
 * @author muhammad farhan 1506673731
 * @version 25-05-2018
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
