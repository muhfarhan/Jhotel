import java.util.ArrayList

public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE;
    
    /**merupakan method untuk memasukkan nilai dari pesanan
     * @param baru
     * return false
     */
    public static boolean addPesanan(Pesanan baru)
    {
        /* digunakan untuk menambahkan pesanan jika terdapat input
         * baru dari class Pesanan
         */
        return false;
    }
    
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
    public static Pesanan getPesanan(Customer cust)
    {
        Pesanan pesan = new Pesanan();
        return pesan;
    }
    
    
    public static String[] getPesananDatabase()
    {
        return pesanan;
    }
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        
    }
}
