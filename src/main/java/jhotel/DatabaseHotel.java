package jhotel;
import java.util.ArrayList;

/**
 * berisi database hotel.
 *
 * @author muhammad farhan - 1506673731
 * @version 25-05-2018
 */
public class DatabaseHotel {
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * method untuk membuat arraylist berisi hotel
     *
     * @return HOTEL_DATABASE
     */
    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    /**
     * untuk mendapatkan ID dari hotel terakhir
     *
     * @return LAST_HOTEL_ID
     */
    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    /**
     * untuk menambahkan data hotel.
     *
     * @param baru
     * @return true
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException {
        for (Hotel hotel : HOTEL_DATABASE) {
            if (hotel.getID() == baru.getID() || (hotel.getNama().equals(baru.getNama()) && hotel.getLokasi().equals(baru.getLokasi()))) {
                throw new HotelSudahAdaException(baru);
                //return false;
            }
        }
        LAST_HOTEL_ID = baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    /**
     * untuk mendapatkan hotel dengan id yang ditentukan
     *
     * @param id menentukan id hotel
     * @return hotel
     */
    public static Hotel getHotel(int id) {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            for (Hotel hotel : HOTEL_DATABASE) {
                if (hotel.getID() == id) {
                    return hotel;
                }
            }
        }
        return null;
    }

    /**
     * untuk menghapus data hotel.
     *
     * @param id
     * @return true
     */
     public static boolean removeHotel ( int id) throws HotelTidakDitemukanException
     {
         for (Hotel hotel : HOTEL_DATABASE) {
             if (hotel.getID() == id) {
                 ArrayList<Room> LIST_ROOM = DatabaseRoom.getRoomsFromHotel(hotel);
                 for (Room kamar : LIST_ROOM) {
                     try {
                         DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                     } catch (RoomTidakDitemukanException e) {
                         System.out.println(e.getPesan());
                     }
                 }
                 if (HOTEL_DATABASE.remove(hotel)) {
                     return true;
                 }
             }
         }
         return false;
     }
}