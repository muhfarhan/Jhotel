
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
    public Lokasi()
    {
        
    }

    /**
     * merupakan method untuk menginisialisasi nilai dari
     * x_coord, y_coord dan deskripsiLokal
     * @param x_coord
     * @param y_coord
     * @param deskripsiLokasi
     */    
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }
    
    /**
     * merupakan method untuk mengambil nilai dari x_coord
     * return x_coord
     */
    public float getX()
    {
        return x_coord;
    }
    
    /**
     * merupakan method untuk mengambil nilai dari y_coord
     * return y_coord
     */
    public float getY()
    {
        return y_coord;
    }
    
    /**
     * merupakan method untuk mengambil nilai dari deskripsi
     * @return deksripsiLokasi
     */
    public String getDeskripsi()
    {
        /*
         * digunakan untuk mengembalikan nilai yang telah
         * didapatkan menjadi nilai dari deksripsiLokasi
         * untuk sementara
         */
        return deskripsiLokasi;
    }
    
    /**
     * merupakan method untuk mengatur nilai x_coord
     * @param x_coord
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
    
    /**
     * merupakan method untuk mengatur nilai pada y_coord
     * @param y_coord
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    
    /**
     * merupakan method untuk mengatur nilai dari deksripsi
     * @param deskripsi
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }
    
    public String toString()
    {
        return "\nKoordinat X      : " + x_coord +
               "\nKoordinat Y      : " + y_coord +
               "\nDeskripsi Lokasi : " + deskripsiLokasi ;
    }
    
    /*
    /**
     * merupakan method untuk mencetak nilai
     *
    public void printData()
    {
        //digunakan untuk mencetak nilai yang diinginkan
        System.out.println("Koordinat X     : " + x_coord);
        System.out.println("Koordinat Y     : " + y_coord);
        System.out.println("Deskripsi Lokasi: " + deskripsiLokasi);
    }
    */
}
