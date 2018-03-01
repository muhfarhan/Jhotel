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
    
    public String getNama()
    {
        return nama;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    
    public void setNama(String nama)
    {
        /*
         * ini digunakan untuk mengganti nilai dari nama
         * nilai nama tersebut ber-type String
         */
        this.nama = nama;
    }
    
    public void printData()
    {
        //digunakan untuk mencetak nama
        System.out.println("Nama :" + nama);
    }
}

    
