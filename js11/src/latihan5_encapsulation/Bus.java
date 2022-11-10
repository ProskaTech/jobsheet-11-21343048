package latihan5_encapsulation;

/**
 *
 * @author Ghenta Alif Alde_21343048
 */
public class Bus {
    public int penumpang;
    public int maxPenumpang;

    public void cetak() {
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
