package jhotel;
import java.util.*;

/**
 * berisi database pesanan.
 *
 * @author muhammad farhan - 1506673731
 * @version 25-05-2018
 */
public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * method untuk membuat arraylist berisi pesanan
     *
     * @return PESANAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesanan(){return PESANAN_DATABASE;}

    /**
     * untuk mendapatkan ID dari pesanan terakhir
     *
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananID(){return LAST_PESANAN_ID;}

    /**
     * untuk menambahkan pesanan ke database.
     *
     * @param baru
     * @return true
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException{

            /* digunakan untuk menambahkan pesanan jika terdapat input
             * baru dari class Pesanan
             */
        for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getStatusAktif() && pesan.getID() == baru.getID())
            {
                throw new PesananSudahAdaException(baru);
            }
        }
        LAST_PESANAN_ID = baru.getID();
        PESANAN_DATABASE.add(baru);
        return true;
    }

    /**
     * untuk mengambil data pemesanan.
     *
     * @param id berisi id
     * @return pesanan
     */
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == id)
            {
                return pesanan;
            }
        }
        return null;
    }

    /**
     * Untuk mengambil data pemesanan.
     *
     * @param kamar
     * @return Pesanan
     */
    public static Pesanan getPesananAktif(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getRoom().equals(kamar) && pesanan.getStatusAktif())
            {
                return pesanan;
            }
        }
        return null;
    }

    /**
     * untuk mengambil data pesanan aktif
     *
     * @param pelanggan berisi objek Customer
     * @return pesanan
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        System.out.println(PESANAN_DATABASE.size());
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pelanggan) && pesanan.getStatusAktif())
            {
                return pesanan;
            }
        }
        return null;
    }

    /**
     * untuk menghapus pesanan dari database.
     *
     * @param pesan berisi objek pesanan.
     * @return true
     */
    public static boolean removePesanan(Customer pesan) throws PesananTidakDitemukanException
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pesan))
            {
                if(pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else
                {
                    if(pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }
                if(PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }
        throw new PesananTidakDitemukanException(pesan);
    }
}
