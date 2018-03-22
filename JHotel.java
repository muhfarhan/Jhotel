
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class JHotel
{
    public static void main(String args[])
    {
        
        /*modul 3
         * Lokasi lokasi = new Lokasi(300,400, "Depok");
         * Customer customer = new Customer(12, "Farhan");
         * Hotel hotel = new Hotel("Mawar", lokasi, 5);
         * Room kamar = new Room(hotel, "S103", true, customer, 3300.000, StatusKamar.Vacant);
         * Pesanan pesan = new Pesanan(20000, customer);
         */
        
        /* modul 4
         * Lokasi lokasi = new Lokasi(400,500,"Depok");
        Hotel satu = new Hotel("Mawar",lokasi,5);
        Room single  = new SingleRoom(satu,"S102",true,StatusKamar.Vacant);
        Customer farhan = new Customer(11,"farhan");
        single.setDailyTariff(300000);
        Pesanan pesan = new Pesanan(10,farhan,single);
        lokasi.printData();
        farhan.printData();
        satu.printData();
        
        Administrasi.pesananDitugaskan(pesan,single);
        pesan.printData();
        single.printData();
        
        if(single instanceof DoubleRoom) 
        {
            System.out.println("\nBenar Double Room");
        }
        else 
        {
           System.out.println("\nBukan Double Room"); 
        }
        
        Lokasi lokasi2 = new Lokasi(500,600,"Jagakarsa");
        Hotel dua = new Hotel("Melati",lokasi2,4);
        Room dobel  = new DoubleRoom(dua,"S302",true,StatusKamar.Vacant);
        Customer muhammad = new Customer(13,"muhammad");
        single.setDailyTariff(550000);
        Pesanan pesan2 = new Pesanan(19,muhammad,dobel);
        lokasi2.printData();
        muhammad.printData();
        dua.printData();
        
        Administrasi.pesananDitugaskan(pesan2,dobel);
        pesan2.printData();
        dobel.printData();
        
        if(dobel instanceof DoubleRoom) 
        {
            System.out.println("\nBenar Double Room");
        }
        else 
        {
           System.out.println("\nBukan Double Room"); 
        }
        */
       
        Customer cust1 = new Customer(1,"farhan",new GregorianCalendar(1997,06,23).getTime());
        //cust1.getDOB();
        System.out.println(cust1.getDOB());
    }
    
    public JHotel()
    {
        
    }
}
