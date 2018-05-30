package jhotel;
import jhotel.DatabasePesanan;
import jhotel.Hotel;
import jhotel.StatusKamar;
import jhotel.TipeKamar;

/**
 * Class Room untuk pendataan ruangan pada JHotel.
 *
 * @author muhammad farhan 1506673731
 * @version 25-05-2018
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    
    /**
     * Constructor untuk kelas Room
     *
     * @param hotel objek hotel
     * @param nomor_kamar nilai nomor kamar
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = StatusKamar.Vacant;
    }

    /**
     * untuk mendapatkan nilai hotel.
     *
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }

    /**
     * untuk mendapatkan nilai nomor kamar.
     *
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    /**
     * untuk mendapatkan nilai tarif.
     *
     * @return dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }

    /**
     * untuk mengetahui status kamar.
     *
     * @return status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    /**
     * abstract method untuk mendapatkan tipe kamar
     *
     */
    public abstract TipeKamar getTipeKamar();

    /**
     * untuk menset nilai hotel.
     *
     * @param hotel objek hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    /**
     * untuk menset nilai nomor kamar.
     *
     * @param nomor_kamar nilai nomor kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * untuk menset nilai tarif.
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        this.dailyTariff = dailyTariff;
    }

    /**
     * untuk menset nilai status kamar.
     *
     * @param status_kamar nilai status kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    /**
     * Method untuk mengubah objek menjadi String
     *
     * @return string
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) == null)
        {
            return "Nama Hotel      : " + getHotel().getNama() +
                   "Tipe Kamar      : " + getTipeKamar() +
                   "Harga           : " + getDailyTariff() +
                   "Status Kamar    : " + getStatusKamar();
        }
        else
        {
            return "Nama Hotel      : " + getHotel().getNama() +
                   "Tipe Kamar      : " + getTipeKamar().toString() +
                   "Harga           : " + getDailyTariff() +
                   "Status Kamar    : " + getStatusKamar() +
                   "Pelanggan       : " + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama();
        }

    }
    
    /*
    public void printData()
    {
        //digunakan untuk mencetak nilai yang diinginkan
        System.out.println("Nama Hotel          : " + hotel.getNama());
        System.out.println("Nomor Kamar         : " + nomor_kamar);
        System.out.println("Status Ketersediaan : " + isAvailable);
        System.out.println("Harga               : " + dailyTariff);
        System.out.println("Status Kamar        : " + status_kamar);
        System.out.println("Tipe Kamar          : " + getTipeKamar());
    }
    */
}
