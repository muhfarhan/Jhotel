package jhotel;

/**
 * Class ini merupakan class Pesanan
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Pesanan
{
    int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    /**
     * Default Constructor for objects of class Pesanan.
     *
     */
    public Pesanan()
    {
        
    }
    
    /**
     * merupakan method untuk menginisialisasi nilai dari
     * biaya dan pelanggan
     *
     * @param jumlahHari
     * @param pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {        
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        isAktif = true;
        tanggalPesan = new Date();
        id = DatabasePesanan.getLastPesananID() + 1;
    }

    /**
     * mendaptkan nilai id pesanan
     *
     * @return id
     */
    public int getID() {return id;}

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai biaya.
     *
     * @return biaya
     */
    public double getBiaya()
    {
        return biaya;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai jumlahhari.
     *
     * @return jumlahHari
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai pelanggan.
     *
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status aktif.
     *
     * @return isAktif
     */
    public boolean getStatusAktif() {return isAktif;}

    /**
     * mendaptakan nilai status diproses.
     *
     * @return isDiproses
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status selesai.
     *
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai room
     *
     * @return kamar
     */
    public Room getRoom()
    {
        return kamar;
    }

    /**
     * mendaptakan nilai tanggal pesan
     *
     * @return tanggalPesan
     */
    public Date getTanggalPesan()
    {
        DateFormat df = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String hasil = df.format(tanggalPesan);
        System.out.println(hasil);
        return tanggalPesan;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai ID.
     *
     * @param id berisi id pesanan
     */
    public void setID(int id) {this.id = id;}

    /**
     * menentukan nilai biaya
     *
     */
    public void setBiaya()
    {
        biaya = (kamar.dailyTariff*jumlahHari);
    }

    /**
     * menentukan nilai jumlahHari
     *
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk menenetukan nilai pelanggan.
     *
     * @param pelanggan objek Costumer
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

    /**
     * merupakan method untuk memasukkan nilai dari StatusAktif
     *
     * @param aktif
     */
    public void setStatusAktif(boolean aktif)
    {
        isAktif = aktif;
    }

    /**
     * merupakan method untuk memasukkan nilai dari StatusDiproses
     *
     * @param diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
       isDiproses = diproses;
    }
    
    /**
     * merupakan method untuk memasukkan nilai dari StatusSelesai
     *
     * @param selesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }

    /**
     * merupakan method untuk memasukkan nilai dari Room
     *
     * @param kamar
     */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }

    /**
     * merupakan method untuk memasukkan nilai dari TanggalPesam
     *
     * @param tanggalPesan
     */
    public void setTanggalPesan(Date tanggalPesan)
    {
       this.tanggalPesan = tanggalPesan; 
    }

    /**
     * merupakan method untuk mencetak hasil String
     *
     * @return String
     */
    public String toString()
    {
        String final_status = "KOSONG";
        
        if (isDiproses == true && isSelesai == false)
        {
            final_status = "DIPROSES";
        } 
        else if (isDiproses == false && isSelesai == false)
        {
            final_status = "KOSONG";
        } 
        else if (isDiproses == false && isSelesai == true)
        {
            final_status = "SELESAI";
        }

        if (kamar != null) {
            return "\n Pesanan \n" +
                    "\n pelanggan =" + pelanggan.getNama() +
                    "\n jumlah hari =" + jumlahHari +
                    "\n hotel =" + kamar.getHotel().getNama() +
                    "\n kamar =" + kamar.getNomorKamar() +
                    "\n tipeKamar =" + kamar.getTipeKamar() +
                    "\n status ='" + final_status;
        }
        return "\n Pesanan \n" +
                "\n pelanggan =" + pelanggan.getNama() +
                "\n jumlah hari =" + jumlahHari +
                "\n hotel = null" +
                "\n kamar = null" +
                "\n tipeKamar = null" +
                "\n status ='" + final_status;
    }
    }

    

