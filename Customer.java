/**
 * Class ini merupakan class Lokasi
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
import java.util.*;
import java.util.regex.*;
public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    public Customer()
    {
        
    }
       
    /**
     * merupakan method untuk menginisialisasi nilai dari 
     * id dan nama
     * @param id
     * @param nama
     */
    public Customer( int id, String nama)//, Date dob)
    {
        this.nama = nama;
        this.id = id;
        //this.dob = dob;
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
        return null;
    }
    
    /**
     * merupakan method untuk mencetak data
     */
    public void printData()
    {
        //digunakan untuk mencetak nilai yang diinginkan
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
    }
}

    
