package jhotel;

/**
 * exception jika kelas room sudah ada
 *
 * @author muhammad farhan 1506673731
 * @version 25-05-2018
 */
public class RoomSudahAdaException extends Exception
{
    private Room room_error;

    /**
     * constructor untuk kelas RoomSudahAdaException
     *
     * @param room_input objek Room
     */
    public RoomSudahAdaException(Room room_input)
    {
        super("Kamar dengan nomor ruang : ");
        room_error = room_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan()
    {
        return super.getMessage() + room_error.getNomorKamar() + " pada " +
                room_error.getHotel() + " sudah terdaftar.";
    }
}
