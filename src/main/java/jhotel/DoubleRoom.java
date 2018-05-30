package jhotel;

/**
 * Class DoubleRoom untuk tipe room double.
 *
 * @author muhammad farhan - 1506673731
 * @version 25-05-2018
 */
public class DoubleRoom extends Room
{
    // instance variables
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;

    /**
     * constructor untuk objects dari class DoubleRoom
     *
     * @param hotel objek hotel
     * @param nomor_kamar nomor kamar
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel,nomor_kamar);
        setDailyTariff(70000);
    }

    /**
     * mengambil nilai objek customer2
     *
     * @return customer2
     */
    public Customer getCustomer2()
    {
        return customer2;
    }

    /**
     * mengambil nilai objek Tipekamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * menentukan nilai objek customer2
     *
     * @param customer2 objek customer2
     */
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }

    /**
     * menentukan daily tarif untuk class DoubleRoom
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}
