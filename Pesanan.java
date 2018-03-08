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
    private String jenis_kamar;
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
    public void setPelanggan(Customer baru)
    {
        /*
         * digunakan untuk mengganti nilai dari pelanggan
         * nilai tersebut didapatkan dari customer
         * dengan menggunakan paramter baru
         */
        pelanggan = baru;
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
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
    
    public void setRoom(Room kamar)
    {
    
    }
    
    /**
     * merupakan method untuk mencetak nilai
     */
    public void printData()
    {
        //digunakan untuk mencetak biaya
        System.out.println("Biaya :" + biaya);
    }
    
}
