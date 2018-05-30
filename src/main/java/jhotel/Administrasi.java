package jhotel;
/**
 * Class Administrasi untuk melakukan kegiatan administrasi JHotel.
 *
 * @author Muhammad Farhan - 1506673731
 * @version 2018.05.20
 */
public class Administrasi
{
    /**
     * Untuk memproses pemesanan kamar hotel.
     *
     * @param pesan berisi objek Pesanan
     * @param kamar berisi objek Room
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        if(pesan != null && kamar != null)
        {
            if(kamar.getStatusKamar()== StatusKamar.Vacant )
            {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);

            kamar.setStatusKamar(StatusKamar.Booked);
            }
            else
                {
                pesan.setStatusAktif(false);
                }
        }
    }

    /**
     * untuk melakukan membatalkan pesanan hotel.
     *
     * @param kamar berisi objek Room
     */
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);

        kamar.setStatusKamar(StatusKamar.Vacant);

    }

    /**
     * untuk menandakan pesanan telah diselesaikan.
     *
     * @param kamar berisi objek Room
     */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);

        kamar.setStatusKamar(StatusKamar.Vacant);
    }

    /**
     * untuk melakukan membatalkan pesanan hotel.
     *
     * @param pesan berisi objek Pesanan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        pesan.getRoom().setStatusKamar(StatusKamar.Vacant);

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }

    /**
     * untuk menandakan pesanan telah diselesaikan.
     *
     * @param pesan berisi objek Pesanan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        pesan.getRoom().setStatusKamar(StatusKamar.Vacant);

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }
}
