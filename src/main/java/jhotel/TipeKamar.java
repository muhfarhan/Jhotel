package jhotel;

/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
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




