package latihan4_inheritance;

/**
 *
 * @author Ghenta Alif Alde_21343048
 */
public class DemoOverride2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.setA(50); 
        obj.setB(150);
        //akan memanggil method  yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}