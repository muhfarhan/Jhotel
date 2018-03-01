
/**
 * Class ini merupakan class Lokasi
 *
 * @author Muhammad Farhan
 * @version 01-03-2018
 */
public class Lokasi
{
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor for objects of class Lokasi
     */  
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    public float getX()
    {
        return x_coord;
    }
    
    public float getY()
    {
        return y_coord;
    }
    
    public String getDeskripsi()
    {
        /*
         * digunakan untuk mengembalikan nilai yang telah
         * didapatkan menjadi nilai dari deksripsiLokasi
         * untuk sementara
         */
        return deskripsiLokasi;
    }
    
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
    
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }
    
    /**
     * merupakan method untuk mencetak nilai
     */
    public void printData()
    {
        //digunakan untuk mencetak lokasi
        System.out.println("Deskripsi :" + deskripsiLokasi);
    }
}
