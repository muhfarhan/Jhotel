package jhotel;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseHotel
{
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;


    public static ArrayList<Hotel> getHotelDatabase() {return HOTEL_DATABASE;}

    public static int getLastHotelID(){return LAST_HOTEL_ID;}

    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++)
        {
            Hotel kamar = HOTEL_DATABASE.get(i);
            if (kamar.getID()==baru.getID() || kamar.getNama()==baru.getNama() && kamar.getLokasi()==baru.getLokasi())
            {
                throw new HotelSudahAdaException(baru);
            }
        }
        LAST_HOTEL_ID=baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    public static Hotel getHotel(int id)
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++)
        {
            Hotel kamar = HOTEL_DATABASE.get(i);
            if (kamar.getID()==id)
            {
                return kamar;
            }
        }
        return null;
    }

    public static boolean removeHotel(int id) throws HotelTidakDitemukanException
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++)
        {
            Hotel kamar = HOTEL_DATABASE.get(i);
            if (kamar.getID() == id)
            {
                ArrayList<Room> KAMAR_TEST = DatabaseRoom.getRoomsFromHotel(kamar);
                for (int j = 0; j < KAMAR_TEST.size(); j++)
                {
                    Room kamar2 = KAMAR_TEST.get(j);
                    try
                    {
                        DatabaseRoom.removeRoom(kamar, kamar2.getNomorKamar());
                    }
                    catch (RoomTidakDitemukanException e)
                    {
                        throw new HotelTidakDitemukanException(id);
                    }
                }
                if (HOTEL_DATABASE.remove(kamar))
                {
                    return true;
                }
            }
        }
        throw new HotelTidakDitemukanException(id);
    }
}
