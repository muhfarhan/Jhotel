/**
 * Class ini merupakan class Pesanan
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    
    public Pesanan()
    {
        
    }
    
    /**
     * merupakan method untuk menginisialisasi nilai dari
     * biaya dan pelanggan
     * @param biaya
     * @param pelanggan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        nama_pelanggan = pelanggan.getNama();
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari biaya
     * @return biaya
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari biaya
     * @return biaya
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari StatusDiproses
     * @return false
     */
    public boolean getStatusDiproses()
    {
        return false;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari StatusSelesai
     * @return false
     */
    public boolean getStatusSelesai()
    {
        return false;
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * merupakan method untuk memasukkan nilai dari biaya
     * @param biaya
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;   
    }
    
    /**
     * merupakan method untuk memasukkan nilai dari pelanggan
     * @param baru
     */
    public void setPelanggan(Customer pelanggan)
    {
        /*
         * digunakan untuk mengganti nilai dari pelanggan
         * nilai tersebut didapatkan dari customer
         * dengan menggunakan paramter baru
         */
        this.pelanggan = pelanggan;
    }
    
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan = nama_pelanggan;
    }
    
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar = tipe_kamar;
    }
    
    /**
     * merupakan method untuk memasukkan nilai dari StatusDiproses
     * @param diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
       isDiproses = diproses;
    }
    
    /**
     * merupakan method untuk memasukkan nilai dari StatusSelesai
     * @param diproses
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }
    
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    /**
     * merupakan method untuk mencetak nilai
     */
    public void printData()
    {
        //digunakan untuk mencetak biaya
        System.out.println("Nama Pelanggan : " + nama_pelanggan);
        System.out.println("Tipe Kamar     : " + tipe_kamar);
        System.out.println("Status Diproses: " + isDiproses);
        System.out.println("Status Selesai : " + isSelesai);
    }
    
}
