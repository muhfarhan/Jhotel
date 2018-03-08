
public class JHotel
{
    public static void main(String args[])
    {
        Customer farhan = new Customer(1,"abc");
        Lokasi depok = new Lokasi(10,20,"macet");
        Hotel wangi = new Hotel("mawar",depok,3);
        Pesanan enak = new Pesanan(3000,farhan);
        farhan.setNama("fahmi");
        farhan.printData();
        DatabasePesanan.addPesanan(enak);
        DatabaseCustomer.addCustomer(farhan);
        enak.printData();
    }
    
    public JHotel()
    {
        
    }
}
