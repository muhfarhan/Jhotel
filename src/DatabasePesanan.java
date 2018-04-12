import java.util.ArrayList

public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE;
    private static int LAST_PESANAN_ID = 0;
    
    /**merupakan method untuk memasukkan nilai dari pesanan
     * @param
     *
     */

    public static ArrayList<Pesanan> getPesanan(){}

    public static int getLastPesananID(){}

    public static boolean addPesanan(Pesanan baru)
    {
        /* digunakan untuk menambahkan pesanan jika terdapat input
         * baru dari class Pesanan
         */
        if(PESANAN_DATABASE.contains(baru)) {
            if (baru.getStatusAktif()= true)
            {
                PESANAN_DATABASE.add(baru);
                return true;
            } else {
                return false;
            }
            else
            {
                PESANAN_DATABASE.add(baru);
                return true;
            }
        }
    }
    

    public static Pesanan getPesanan(int id)
    {
        if(id == Pesanan.getID())
        {
            return Pesanan.getID();
        }
        else
        {
            return null;
        }
    }

    public static Pesanan getPesanan(Room kamar){}

    public static Pesanan getPesananAktif(Customer pelanggan){}

    /**
     * merupakan method untuk menghilangkan nilai dari pesanan
     * @return false
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
    /**
     * merupakan method untuk membuat object pesan yang baru
     * @param cust
     * @return pesan
     */
    /**
}
