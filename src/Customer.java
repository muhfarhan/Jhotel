/**
 * Class ini merupakan class Lokasi
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

public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;

       
    /**
     * merupakan method untuk menginisialisasi nilai dari 
     * id dan nama
     * @param nama
     */
    public Customer(String nama, int tahun, int bulan, int tanggal, String email)
    {
        this.nama = nama;
        id = DatabaseCustomer.getLastCustomerID() + 1;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
        this.email = email;
    }
    
    public Customer(String nama, Date dob, String email)
    {
        this.nama = nama;
        id = DatabaseCustomer.getLastCustomerID() +1 ;
        this.dob = dob;
        this.email = email;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari id
     * @return id
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * merupakan method untuk mendapatkan nilai dari nama
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public Date getDOB()
    {
        DateFormat form = new SimpleDateFormat("     'DOB : ' dd MMMM yyyy");
        String out = form.format(dob);
        System.out.print(out);
        return dob;
    }
    
    /**
     * merupakan method untuk mengatur nilai dari id
     * @param id
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * merupakan method untuk mengatur nilai dari nama
     * @param nama
     */
    public void setNama(String nama)
    {
        /*
         * ini digunakan untuk mengganti nilai dari nama
         * nilai nama tersebut ber-type String
         */
        this.nama = nama;
    }
    
    public void setEmail(String email)
    {
        String pattern ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(email);
    
        if (mat.matches())
        {
            this.email = email;
        }
    }
    
    
    public void setDOB(Date dob)
    {
        this.dob = dob;
    
    }
    
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) != null)
        {
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nE-Mail        : " + email +
                   "\nDate of Birth : " + dob +
                   "\nBooking order is in progress";        
        }
        else
        {
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nE-Mail        : " + email +
                   "\nDate of Birth : " + dob;        
        }
    }
    
    /*
    /**
     * merupakan method untuk mencetak data
     *
    public void printData()
    {
        //digunakan untuk mencetak nilai yang diinginkan
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
    }
    */
}

    
