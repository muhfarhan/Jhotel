package jhotel;
import java.util.*;

/**
 * berisi database room
 *
 * @author muhammad farhan -1506673731
 * @version 25--5-2018
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    /**
     * membuat arraylist berisi room
     *
     * @return ROOM_DATABASE
     */
    public static ArrayList<Room> getRoomDatabase(){return ROOM_DATABASE;}

    /**
     * menambahkan database room
     *
     * @param baru berisi objek Room
     * @return true
     */
    public static boolean addRoom(Room baru) throws RoomSudahAdaException
    {
        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(baru.getHotel()) && kamar.getNomorKamar().equals(baru.getNomorKamar())){
                throw new RoomSudahAdaException(baru);
                //return false;
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
    * mengambil database room berdasarkan hotel dan nomor kamar
    *
    * @param hotel berisi objek Hotel
    * @param nomor_kamar berisi nomor kamar
    * @return kamar
    */
    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar)){
                return kamar;
            }
        }
        return null;
    }

    /**
     * mengambil arraylist room yang berasal dari hotel
     *
     * @param hotel berisi objek Hotel
     * @return tempRoom
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> tempRoom = new ArrayList<>();
        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(hotel)){
                tempRoom.add(kamar);
            }
        }
        return tempRoom;
    }

    /**
     * mengambil arraylist dari vacant room
     *
     * @return tempRoom
     */
    public static ArrayList<Room> getVacantRoom()
    {
        ArrayList<Room> tempRoom = new ArrayList<>();

        for(Room kamar : ROOM_DATABASE){
            if(kamar.getStatusKamar().equals(StatusKamar.Vacant)){
                tempRoom.add(kamar);
            }
        }
        return tempRoom;
    }

    /**
    * menghapus database room
    *
    * @param hotel berisi objek Hotel
    * @param nomor_kamar berisi nomor kamar
    * @return true
    */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws  RoomTidakDitemukanException
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar)){
                Administrasi.pesananDibatalkan(kamar);
                if(ROOM_DATABASE.remove(kamar)){
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel,nomor_kamar);
    }
}

