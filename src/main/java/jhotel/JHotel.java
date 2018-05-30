package jhotel;
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class JHotel
{
    public static void main(String args[])
    {
        try{
            DatabaseHotel.addHotel(new Hotel("Tom", new Lokasi(12, 23, "Tom and Jerry"), 5));
        }
        catch(HotelSudahAdaException a)
        {
            a.getPesan();
        }
/*
        try{
            DatabaseCustomer.addCustomer(new Customer("a",12,2,4,"a@b.com","123"));
        }
        catch (PelangganSudahAdaException b)
        {
            b.getPesan();
        }
*/
        try
        {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "S100"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "S101"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "S102"));
        }
        catch(RoomSudahAdaException a)
        {
            a.getPesan();
            System.out.println("test :" + DatabaseRoom.getRoomDatabase());
        }

        SpringApplication.run(JHotel.class, args);

    }
    
    public JHotel()
    {
        
    }
}
