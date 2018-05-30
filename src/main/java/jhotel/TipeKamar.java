package jhotel;

/**
 * Enumeration class TipeKamar - berisi tipe-tipe kamar pada JHotel
 *
 * @author muhammad farhan 1506673731
 * @version 25-05-2018
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium"); 
    private String tipe;
    
    public String toString()
    {
        return tipe;
    }
    
    TipeKamar(String tipe)
    {
        this.tipe = tipe;
    }
    
    public String tipe()
    {
        return tipe;
    }
}




