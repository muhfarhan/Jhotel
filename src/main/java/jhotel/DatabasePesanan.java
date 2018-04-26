package jhotel;
import java.util.*;

public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;
    
    /**merupakan method untuk memasukkan nilai dari pesanan
     * @param
     *
     */

    public static ArrayList<Pesanan> getPesanan(){return PESANAN_DATABASE;}

    public static int getLastPesananID(){return LAST_PESANAN_ID;}

    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException{

            /* digunakan untuk menambahkan pesanan jika terdapat input
             * baru dari class Pesanan
             */
            if (PESANAN_DATABASE.contains(baru))
            {
                if (baru.getStatusAktif() == true)
                {
                    throw new PesananSudahAdaException(baru);
                }
                else
                    {
                    PESANAN_DATABASE.add(baru);
                    return true;
                    }
            }
            else
                {
                PESANAN_DATABASE.add(baru);
                return true;
                }
    }

    

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

    public static Pesanan getPesananAktif(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getStatusAktif())
            {
                return pesanan;
            }
        }

        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pelanggan))
            {
                if(pesanan.getStatusAktif())
                {
                    return pesanan;
                }
            }
        }
        return null;
    }


    /**
     * merupakan method untuk menghilangkan nilai dari pesanan
     * @return false
     */
    public static boolean removePesanan(Customer pesan) throws PesananTidakDitemukanException
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.equals(pesan))
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
