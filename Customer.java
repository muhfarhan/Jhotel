/**
 * Class ini merupakan class Lokasi
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
public class Customer
{
    protected int id;
    protected String nama;
    
    public Customer()
    {
        
    }
       
    /**
     * merupakan method untuk menginisialisasi nilai dari 
     * id dan nama
     * @param id
     * @param nama
     */
    public Customer( int id, String nama)
    {
        this.nama = nama;
        this.id = id;
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

    
