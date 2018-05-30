package jhotel;

/**
 * exception jika pesanan tidak ditemukan
 *
 * @author muhammad farhan 1506673731
 * @version 25-05-2018
 */
public class PesananTidakDitemukanException extends Exception
{
    private Customer pelanggan_error;

    /**
     * constructor untuk kelas PesananTidakDitemukanException
     *
     * @param pelanggan_input object Customer
     */
    public PesananTidakDitemukanException(Customer pelanggan_input)
    {
        super("Pesanan yang dipesan oleh : ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan()
    {
        return super.getMessage() + pelanggan_error.getNama() + "tidak ditemukan.";
    }
}
