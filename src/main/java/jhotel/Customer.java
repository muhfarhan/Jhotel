package jhotel;
/**
 * Class Customer untuk mengatur customer
 *
 * @author Muhammad Farhan - 1506673731
 * @version 2018.05.20
 */
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Customer
{
    private int id;
    private String nama;
    private String email;
    private Date dob;
    private String password;

    /**
     * Overloading Constructor for objects of class Customer.
     *
     * @param nama berisi nama Customer
     * @param tahun berisi tahun
     * @param bulan berisi bulan
     * @param tanggal berisi tanggal
     * @param email berisi Email
     * @param password berisi password
     */
    public Customer(String nama, int tahun, int bulan, int tanggal, String email,String password)
    {
        this.nama = nama;
        id = DatabaseCustomer.getLastCustomerID() + 1;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
        this.email = email;
        this.password = password;
    }

    /**
     * Overloading Constructor for objects of class Customer.
     *
     * @param nama berisi nama customer.
     * @param dob berisi objek Date.
     * @param email berisi Email
     * @param password berisi password
     */
    public Customer(String nama, Date dob, String email,String password)
    {
        this.nama = nama;
        id = DatabaseCustomer.getLastCustomerID() +1 ;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai id.
     *
     * @return id
     */
    public int getID()
    {
        return id;
    }

    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan password.
     *
     * @return password
     */
    public String getPassword(){return password;}

    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai nama.
     *
     * @return nama berisi nama customer.
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * untuk mendapatikan nilai email.
     *
     * @return email berisi email.
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * untuk mendapatkan nilai tanggal bertipe Date
     *
     * @return dob
     */
    public Date getDOB()
    {
        return dob;
    }

    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id.
     *
     * @param id berisi id.
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Menentukan password user
     *
     * @param password berisi password
     */
    public void setPassword(String password)
        {
            this.password=password;
        }

    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id.
     *
     * @param nama berisi nama.
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
     * untuk menentukan nilai email.
     *
     * @param email berisi email.
     */
    public void setEmail(String email)
    {
        // untuk validasi email menyocokkan menggunakan pattern
        String pattern ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(email);
    
        if (mat.matches())
        {
            this.email = email;
        }
    }

    /**
     * untuk menentukan nilai tanggal
     *
     * @param dob objek Date
     */
    public void setDOB(Date dob)
    {
        this.dob = dob;
    
    }

    /**
     * untuk mencetak String pada objek Customer
     *
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) != null)
        {
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nE-Mail        : " + email +
                   "\nDate of Birth : " + getDOB() +
                   "\nBooking order is in progress";        
        }
        else
        {
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nE-Mail        : " + email +
                   "\nDate of Birth : " + getDOB();
        }
    }
}

    
