package jhotel;

/**
 * exception jika hotel tidak ditemukan
 *
 * @author muhammad farhan 1506673731
 * @version 25-05-2018
 */
public class HotelTidakDitemukanException extends Exception
{
    private int hotel_error;

    /**
     * constructor untuk kelas HotelTidakDitemukanException
     *
     * @param hotel_input object Hotel
     */
    public HotelTidakDitemukanException(int hotel_input)
    {
        super("Hotel dengan ID :");
        hotel_error = hotel_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan()
    {
        return super.getMessage() + hotel_error + "tidak ditemukan.";
    }
}
