
public class JHotel
{
    public static void main(String args[])
    {
        /*Lokasi lokasi = new Lokasi(300,400, "Depok");
         * Customer customer = new Customer(12, "Farhan");
         * Hotel hotel = new Hotel("Mawar", lokasi, 5);
         * Room kamar = new Room(hotel, "S103", true, customer, 3300.000, StatusKamar.Vacant);
         * Pesanan pesan = new Pesanan(20000, customer);
         */
        Lokasi lokasi = new Lokasi(400,500,"Depok");
        Hotel satu = new Hotel("Mawar",lokasi,5);
        SingleRoom single  = new SingleRoom(satu,"S102",true,StatusKamar.Vacant);
        Customer farhan = new Customer(11,"farhan");
        Pesanan pesan = new Pesanan(10,farhan,single);
        lokasi.printData();
        farhan.printData();
        satu.printData();
        
        Administrasi.pesananDitugaskan(pesan,single);
        pesan.printData();
        single.printData();
        
        
    }
    
    public JHotel()
    {
        
    }
}
