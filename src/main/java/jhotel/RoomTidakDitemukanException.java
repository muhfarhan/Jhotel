package jhotel;

/**
 * exception untuk kelas room jika tidak ditemukan
 *
 * @author muhammad farhan 1506673731
 * @version 25-05-2018
 */
public class RoomTidakDitemukanException extends Exception
{
    private Hotel hotel_error;
    private String room_error;

    /**
     * constructor untuk kelas RoomTidakDitemukanException
     *
     * @param hotel_input objek Hotel
     * @param room_input objek Room
     */
    public RoomTidakDitemukanException(Hotel hotel_input, String room_input)
    {
        super("Kamar yang terletak di : ");
        hotel_error = hotel_input;
        room_error = room_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan()
    {
        return super.getMessage() + hotel_error + "dan dengan nomor kamar" +
                room_error + "tidak ditemukan.";
    }
}
