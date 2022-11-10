package latihan1_inheritance;

/**
 *
 * @author Ghenta Alif Alde_21343048
 */
public class Kedua extends Pertama {
    private int b = 8;

    protected void BacaSuper() {
        System.out.print("Nilai b = " + b);
        terprotek();
        info();
    } 
}
