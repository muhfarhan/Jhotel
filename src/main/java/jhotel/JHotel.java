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
       
        //Customer cust1 = new Customer(1,"farhan",new GregorianCalendar(1997,06,23).getTime());
        //cust1.getDOB();
        //System.out.println(cust1.getDOB());

        /**
        //modul 6
        DatabaseCustomer.addCustomer(new Customer("farhan", 1997, 7, 23));
        DatabaseCustomer.addCustomer(new Customer("saya", 2015, 6, 6));
        DatabaseCustomer.addCustomer(new Customer("hidup", 2017, 4, 19));

        DatabaseHotel.addHotel(new Hotel("mawar", new Lokasi(20,30,"depok"), 4));
        DatabaseHotel.addHotel(new Hotel("melati", new Lokasi(10,30,"citarum"), 5));
        DatabaseHotel.addHotel(new Hotel("alibaba", new Lokasi(40,50,"ciliwung"), 5));

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"s203"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2),"k301"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(3),"k401"));


        for (Customer custom : DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(custom);
        }
        for (Hotel hotel : DatabaseHotel.getHotelDatabase())
        {
            System.out.println(hotel);
        }
        for (Room pelanggan : DatabaseRoom.getRoomDatabase())
        {
            System.out.println(pelanggan);
        }

        DatabasePesanan.addPesanan(new Pesanan(12, DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(10, DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(11, DatabaseCustomer.getCustomer(3)));

        for (Pesanan pesan : DatabasePesanan.getPesanan())
        {
            System.out.println(pesan);
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"s203"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(2),"s301"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(3),"s401"));
        for (Pesanan pesan2 : DatabasePesanan.getPesanan())
        {
            System.out.println(pesan2);
        }

        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));

        for (Pesanan pesan3 :DatabasePesanan.getPesanan()){
            System.out.println(pesan3);
        }
         */

        //modul7
        /*
        System.out.println("\n\nTry-Catch 1 pelanggan sudah ada\n");


        Customer A = new Customer("farhan", 2018,2,12, "farhan@yah.com");
        try
        {
            DatabaseCustomer.addCustomer(A);
        }
        catch(PelangganSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Customer B = new Customer("muhammad", 2016, 4,31, "asik@google.com");
        try
        {
            DatabaseCustomer.addCustomer(B);
        }
        catch(PelangganSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Customer C = new Customer("Boan", 1937, 7,13, "muhfarhan@yahoo.com");
        try
        {
            DatabaseCustomer.addCustomer(C);
            DatabaseCustomer.addCustomer(C);
        }
        catch(PelangganSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 2 pesanan sudah ada\n");

        Pesanan pesan1 = new Pesanan(13, A);
        pesan1.setStatusAktif(true);
        try
        {
            DatabasePesanan.addPesanan(pesan1);
        }
        catch (PesananSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Pesanan pesan2 = new Pesanan(10, B);
        pesan2.setStatusAktif(true);
        try
        {
            DatabasePesanan.addPesanan(pesan2);
        }
        catch (PesananSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Pesanan pesan3 = new Pesanan(12, C);
        pesan3.setStatusAktif(true);
        try
        {
            DatabasePesanan.addPesanan(pesan2);
            DatabasePesanan.addPesanan(pesan3);
        }
        catch (PesananSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 3 hotel sudah ada \n");


        Lokasi test1 = new Lokasi(1, 2 , "Depok");
        Lokasi test2 = new Lokasi(3, 4, "Tangerang");
        Lokasi test3 = new Lokasi(5, 6, "Ciliwung");
        Lokasi test4 = new Lokasi(7, 8, "Srengseng");

        Hotel D = new Hotel("Mawar", test1, 5);
        try
        {
            DatabaseHotel.addHotel(D);
        }
        catch (HotelSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Hotel E = new Hotel("Melati", test2, 4);
        try
        {
            DatabaseHotel.addHotel(E);
        }
        catch (HotelSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Hotel F = new Hotel("Anggrek", test3, 3);
        try
        {
            DatabaseHotel.addHotel(F);
        }
        catch (HotelSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Hotel G = new Hotel("Rafflesia", test4, 3);
        try
        {
            DatabaseHotel.addHotel(G);
            DatabaseHotel.addHotel(D);
        }
        catch (HotelSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }



        System.out.println("\n\nTry-Catch 4 \n");


        Room A101 = new SingleRoom(D, "A101");
        try
        {
            DatabaseRoom.addRoom(A101);
        }
        catch (RoomSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Room D404 = new PremiumRoom(D, "D404");
        try
        {
            DatabaseRoom.addRoom(D404);
        }
        catch (RoomSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Room B202 = new DoubleRoom(E, "B202");
        try
        {
            DatabaseRoom.addRoom(B202);
        }
        catch (RoomSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Room C303 = new PremiumRoom(F, "C303");
        try
        {
            DatabaseRoom.addRoom(C303);
            DatabaseRoom.addRoom(A101);
        }
        catch (RoomSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 5 pelanggan tidak ditemukan \n");

        try
        {
            DatabaseCustomer.removeCustomer(1);
            DatabaseCustomer.removeCustomer(1);
        }
        catch (PelangganTidakDitemukanException a)
        {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\nTry-Catch 6 hotel tidak ditemukan\n");

        try
        {
            DatabaseHotel.removeHotel(2);
            DatabaseHotel.removeHotel(3);
            DatabaseHotel.removeHotel(5);
        }
        catch (HotelTidakDitemukanException a)
        {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\nTry-Catch 7 room tidak ditemukan\n");

        try
        {
            DatabaseRoom.removeRoom(D, "D404");
            DatabaseRoom.removeRoom(F, "A303");
        }
        catch (RoomTidakDitemukanException a)
        {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 8 \n");
        Customer pesan = new Customer("muha", 2016, 4,31, "asik@go.com");        try
        {
            DatabasePesanan.removePesanan(pesan);
        }
        catch (PesananTidakDitemukanException a)
        {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\n---  Hasil Akhir Pesanan  --- \n");
        System.out.println(DatabasePesanan.getPesanan());
        System.out.println("\n\n---  Hasil Akhir Customer  --- \n");
        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println("\n\n---  Hasil Akhir Room  --- \n");
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println("\n\n---  Hasil Akhir Hotel  --- \n");
        System.out.println(DatabaseHotel.getHotelDatabase());
        */

        //modul8

        try{
            DatabaseHotel.addHotel(new Hotel("Tom", new Lokasi(12, 23, "Tom and Jerry"), 5));
            DatabaseHotel.addHotel(new Hotel("Jerry", new Lokasi(32, 21, "Jerry and Tom"), 6));
        }
        catch(HotelSudahAdaException a)
        {
            a.getPesan();
        }

        try
        {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "S100"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "S101"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(2), "S102"));
        }
        catch(RoomSudahAdaException a)
        {
            a.getPesan();
        }

        System.out.println("test :" + DatabaseRoom.getRoomDatabase());
        SpringApplication.run(JHotel.class, args);

    }
    
    public JHotel()
    {
        
    }
}
