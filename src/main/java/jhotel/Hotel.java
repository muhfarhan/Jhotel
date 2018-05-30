package jhotel;

/**
 * Class ini merupakan class Hotel
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
public class Hotel
{
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    
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
       id = DatabaseHotel.getLastHotelID()+ 1;
    }

    /**
     * mendapatkan nilai id
     *
     * @return id
     */
    public int getID(){return id;}
    
    /**
     * merupakan method untuk mendapatkan nilai dari bintang
     *
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari nama
     *
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari Lokasi
     *
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }

    /**
     * menentukan nilai id
     *
     * @param id berisi id
     */
    public void setID(int id){this.id = id;}
    
    /**
     * merupakan method untuk memasukkan nilai dari nama
     *
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
    
    /**
     * merupakan method untuk memasukkan nilai dari lokasi
     *
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
         this.lokasi = lokasi;
    }
    
    /**
     * merupakan method untuk memasukkan nilai dari bintang
     *
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    /**
     * untuk mencetak String pada objek Customer
     *
     * @return string
     */
    public String toString()
    {
       return  "\nNama Hotel     : " + nama +
               "\nLokasi Hotel   : " + lokasi.getDeskripsi() +
               "\nBintang Hotel  : " + bintang ;
    }
}
