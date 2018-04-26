package jhotel;
import java.util.*;

/**
 * Write a description of class DatabaseRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    public static ArrayList<Room> getRoomDatabase(){return ROOM_DATABASE;}

    public static boolean addRoom(Room baru) throws RoomSudahAdaException
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++)
        {
            Room kamar = ROOM_DATABASE.get(i);
            if (kamar.getHotel().equals(baru.getHotel())&& kamar.getNomorKamar()==baru.getNomorKamar())
            {
                throw new RoomSudahAdaException(baru);
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++)
        {
            Room kamar = ROOM_DATABASE.get(i);
            if (kamar.getHotel().equals(hotel)&&kamar.getNomorKamar().equals(nomor_kamar))
            {
                return kamar;
            }
        }
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++)
        {
            Room kamar = ROOM_DATABASE.get(i);
            if (kamar.getHotel().equals(hotel))
            {
                REQUEST_ROOM.add(kamar);
            }
        }
        return REQUEST_ROOM;
    }

    public static ArrayList<Room> getVacantRoom()
    {
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++)
        {
            Room kamar = ROOM_DATABASE.get(i);
            if (kamar.getStatusKamar() == StatusKamar.Vacant)
            {
                REQUEST_ROOM.add(kamar);
            }
        }
        return REQUEST_ROOM;
    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws  RoomTidakDitemukanException
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++)
        {
            Room kamar = ROOM_DATABASE.get(i);
            if (kamar.getHotel().equals(hotel)&&kamar.getNomorKamar().equals(nomor_kamar))
            {
                Administrasi.pesananDibatalkan(kamar);
            }
            if (ROOM_DATABASE.remove(kamar))
            {
                return true;
            }
        }
        throw new RoomTidakDitemukanException(hotel,nomor_kamar);
    }
}

