package jhotel;
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{
    /**
     * Constructor for objects of class Administrasi
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        
        kamar.setStatusKamar(StatusKamar.Booked);
    }

    /*
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
    }*/

    /*
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
    }*/
    
    public static void pesananDibatalkan(Room kamar)
    {
        /* kamar.pesan.setStatusSelesai(false); 
         * tidak bisa dilakukan karena pesan merupakan private
         * object milik class Room*/
        /**
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        */
        kamar.setStatusKamar(StatusKamar.Vacant);
         /**
        Pesanan wait = new Pesanan();
        wait = kamar.getPesanan();
        wait.setStatusSelesai(false);
        wait.setStatusDiproses(false);
        wait.setRoom(null);
        kamar.setPesanan(wait);
        
        roomLepasPesanan(kamar);
        kamar.getPesanan().getStatus(false);
         */
    }
    
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        roomLepasPesanan(kamar);
        //kamar.setStatusKamar(StatusKamar.Vacant);
        /**
        Pesanan wait = new Pesanan();
        wait = kamar.getPesanan();
        wait.setStatusSelesai(true);
        wait.setStatusDiproses(false);
        wait.setRoom(null);
        kamar.setPesanan(wait);
        
        roomLepasPesanan(kamar);
        kamar.getPesanan().getStatus(false);
         */
    }

    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }

    public static void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.Vacant);
    }
}
