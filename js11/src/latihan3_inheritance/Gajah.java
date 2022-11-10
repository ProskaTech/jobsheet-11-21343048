package latihan3_inheritance;

/**
 *
 * @author Ghenta Alif Alde_21343048
 */
public class Gajah extends Hewan {
    //meng-overwrite method pada class Hewan
    public static void testClassMethod() {
        System.out.println("The Class Method in Hewan");
    }
    
    //meng-overwrite method pada class Hewan
    public void testInstanceMethod() {
        System.out.println("The Instance Method in Gajah");
    }
    
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
    }
}
