
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTarff;
    private StatusKamar status_kamar;
    private Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        
    }

    public Hotel getHotel()
    {
        return hotel;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    
}
