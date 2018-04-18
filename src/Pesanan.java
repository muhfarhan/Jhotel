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
    
    public Pesanan()
    {
        
    }
    
    /**
     * merupakan method untuk menginisialisasi nilai dari
     * biaya dan pelanggan
     * @param
     * @param pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, boolean isAktif)
    {        
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.biaya = (kamar.dailyTariff*jumlahHari);
        this.isAktif = true;
        id = DatabasePesanan.getLastPesananID() + 1;
    }

    /**
    public Pesanan(double jumlahHari, Customer pelanggan,
    Date tanggalPesan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.tanggalPesan = tanggalPesan;
    }
     */
    
    /**
     * merupakan method untuk mendapatkan nilai dari biaya
     * @return biaya
     */
    public int getID() {return id;}

    public double getBiaya()
    {
        return biaya;
    }
    
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari biaya
     * @return biaya
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    public boolean getStatusAktif() {return false;}
    
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

    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }

    public void setID(int id) {this.id = id;}
    
    /**
     * merupakan method untuk memasukkan nilai dari biaya
     * @param biaya
     */
    public void setBiaya(double biaya)
    {
        this.biaya = (kamar.dailyTariff*jumlahHari);   
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
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

    public void setStatusAktif(boolean aktif)
    {
        isAktif = aktif;
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
    
    public void setTanggalPesan(Date tanggalPesan)
    {
       this.tanggalPesan = tanggalPesan; 
    }
    
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
        
        return "Dibuat Oleh " +pelanggan.getNama() +
                ".Proses booking untuk" +kamar.getHotel()+
                "Kamar Nomor " + kamar.getNomorKamar()+
                "dengan tipe kamar yang diinginkan "+kamar.getTipeKamar()+
                ". Status :" +final_status+ ".";
    }
    }
    
    /*
    /**
     * merupakan method untuk mencetak nilai
     *
    public void printData()
    {
        //digunakan untuk mencetak biaya
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Status Diproses: " + isDiproses);
        System.out.println("Status Selesai : " + isSelesai);
        System.out.println("Jumlah Hari    : " + jumlahHari);
        System.out.println("Biaya Total    : " + biaya);
    }
    */
    

