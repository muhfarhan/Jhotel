package jhotel;

/**
 * exception jika pelanggan tidak ditemukan
 *
 * @author muhammad farhan 1506673731
 * @version 25-05-2018
 */
public class PelangganTidakDitemukanException extends Exception
{
    private int pelanggan_error;

    /**
     * constructor untuk kelas PelangganTidakDitemukanException
     *
     * @param pelanggan_input objek Customer
     */
    public PelangganTidakDitemukanException(int pelanggan_input)
    {
        super("Data Customer dengan ID : ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan()
    {
        return super.getMessage() + pelanggan_error + "tidak ditemukan.";
    }
}

