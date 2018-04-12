
/**
 * Class ini merupakan class Hotel
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
public class Hotel
{
   private String nama;
   private Lokasi lokasi;
   private int bintang;

    /**
     * Constructor dari objects class Hotel
     */
    public Hotel()
    {
        
    }
    
    /**
     * merupakan method untuk menginisialisasi nilai dari
     * nama, lokasi dan bintang
     * @param nama
     * @param lokasi
     * @param bintang
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
       this.nama = nama;
       this.lokasi = lokasi;
       this.bintang = bintang;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari bintang
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    
    /**merupakan method untuk mendapatkan nilai dari nama
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**merupakan method untuk mendapatkan nilai dari Lokasi
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    /**merupakan method untuk memasukkan nilai dari nama
     * @param nama
     */
    public void setNama(String nama)
    {
        /*
         * ini digunakan untuk mengganti nilai dari nama
         * nilai nama tersebut ber-type String
         */
        this.nama = nama;
    }
    
    /**merupakan method untuk memasukkan nilai dari lokasi
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
         this.lokasi = lokasi;
    }
    
    /**merupakan method untuk memasukkan nilai dari bintang
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
    public String toString()
    {
       return  "\nNama Hotel     : " + nama +
               "\nLokasi Hotel   : " + lokasi +
               "\nBintang Hotel  : " + bintang ;
    }
    
    /*
    /**
     * merupakan method untuk mencetak nilai
     *
    public void printData()
    {
        //digunakan untuk mencetak nilai yang diinginkan
        System.out.println("Nama Hotel : " + nama);
        System.out.println("Lokasi     : " + lokasi.getDeskripsi());
        System.out.println("Bintang    : " + bintang);
    }
    */
}
