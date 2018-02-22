
public class DatabasePesanan
{
    private String[] list_pesanan;
    
    public boolean addPesanan(Pesanan baru)
    {
        return false;
    }
    
    public boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
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
