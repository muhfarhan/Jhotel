import java.util.ArrayList;

/**
 * Class ini merupakan class Pesanan
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE;
    private static int LAST_CUSTOMER_ID;

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID(){return LAST_CUSTOMER_ID;}

    /**
     * merupakan method untuk menginisialisasi nilai dari
     * baru yang bersala dari customer
     * @param baru
     * @return false
     */
    public static boolean addCustomer(Customer baru)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++)
        {
            Customer pelanggan = CUSTOMER_DATABASE.get(i);
            if (pelanggan.getID()==baru.getID())
            {
                return false;
            }
        }
        LAST_CUSTOMER_ID = baru.getID();
        CUSTOMER_DATABASE.add(baru);
        return true;
    }

    public static Customer getCustomer(int id)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++)
        {
            Customer pelanggan = CUSTOMER_DATABASE.get(i);
            if (pelanggan.getID() == id)
            {
                return pelanggan;
            }
        }
        return null;
    }

    public static boolean removeCustomer(int id)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++)
        {
            Customer pelanggan = CUSTOMER_DATABASE.get(i);
            if (pelanggan.getID() == id)
            {
                Pesanan pesan = DatabasePesanan.getPesananAktif(pelanggan);
                DatabasePesanan.removePesanan(pesan);
                if (CUSTOMER_DATABASE.remove(pelanggan))
                {
                    return true;
                }
            }
        }
        return false;
    }
    

}
