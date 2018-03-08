
public class DatabasePesanan
{
    private String[] list_pesanan;
    
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
    public boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
    /**
     * merupakan method untuk membuat object pesan yang baru
     * @param cust
     * @return pesan
     */
    public Pesanan getPesanan(Customer cust)
    {
        Pesanan pesan = new Pesanan();
        return pesan;
    }
    
    
    public String[] getPesananDatabase()
    {
        return list_pesanan;
    }
    
    public void pesananDibatalkan(Pesanan pesan)
    {
        
    }
}
