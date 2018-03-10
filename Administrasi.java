
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
        
        roomAmbilPesanan(pesan, kamar);
    }

    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }
    
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Room kamar)
    {
        /* kamar.pesan.setStatusSelesai(false); 
         * tidak bisa dilakukan karena pesan merupakan private
         * object milik class Room*/
        Pesanan wait = new Pesanan();
        wait = kamar.getPesanan();
        wait.setStatusSelesai(false);
        wait.setStatusDiproses(false);
        wait.setRoom(null);
        kamar.setPesanan(wait);
        
        roomLepasPesanan(kamar);
    }
    
    public static void pesananSelesai(Room kamar)
    {
        Pesanan wait = new Pesanan();
        wait = kamar.getPesanan();
        wait.setStatusSelesai(true);
        wait.setStatusDiproses(false);
        wait.setRoom(null);
        kamar.setPesanan(wait);
        
        roomLepasPesanan(kamar); 
    }
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}
