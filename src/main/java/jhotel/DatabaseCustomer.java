package jhotel;

import java.util.ArrayList;

/**
 * berisi database customer
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
public class DatabaseCustomer {
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID;

    /**
     * method untuk membuat arraylist berisi customer
     *
     * @return CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    /**
     * untuk mendapatkan ID dari customer terakhir
     *
     * @return LAST_CUSTOMER_ID
     */
    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    /**
     * untuk menambahkan data customer.
     *
     * @param baru
     * @return true
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException {
        for (Customer pelanggan : CUSTOMER_DATABASE) {
            if (pelanggan.getID() == baru.getID() || pelanggan.getEmail().equals(baru.getEmail())) {
                throw new PelangganSudahAdaException(baru);
            }
        }
        LAST_CUSTOMER_ID = baru.getID();
        CUSTOMER_DATABASE.add(baru);
        return true;
    }

    /**
     * untuk mendapatkan customer dengan id yang ditentukan
     *
     * @param id menentukan id customer
     * @return customer
     */
    public static Customer getCustomer(int id) {
            for (Customer pelanggan : CUSTOMER_DATABASE) {
                if (pelanggan.getID() == id) {
                    return pelanggan;
                }
            }
        return null;
    }

    /**
     * untuk mendapatkan customer yang login menggunakan email dan passwordnya.
     *
     * @param email menentukan nilai email
     * @param password menentukan nilai password
     * @return pelanggan
     */
    public static Customer getCustomerLogin (String email, String password)
    {
        for (Customer pelanggan : CUSTOMER_DATABASE) {
            if (pelanggan.getEmail().equals(email) && pelanggan.getPassword().equals(password)) {
                return pelanggan;
            }
        }
        return null;
    }


    /**
     * untuk menghapus data customer.
     *
     * @param id
     * @return true
     */
    public static boolean removeCustomer ( int id) throws PelangganTidakDitemukanException
    {
        for (Customer pelanggan : CUSTOMER_DATABASE) {
            if (pelanggan.getID() == id) {
                Pesanan pesan = DatabasePesanan.getPesananAktif(pelanggan);
                try {
                    DatabasePesanan.removePesanan(pelanggan);
                } catch (PesananTidakDitemukanException e) {
                    System.out.println(e.getPesan());
                }
                if (CUSTOMER_DATABASE.remove(pelanggan)) {
                    return true;
                }
            }
        }
        return false;
    }
}