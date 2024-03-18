import packs.throwEx;
import packs.exep;


public class excepMain {
    public static void main(String[] args) {
        throwEx thrower = new throwEx();
    
        try {
            //thrower.firstMeth();
           // thrower.secondMeth();
            thrower.thirdMeth();
        } catch (exep e) {
            System.out.println("Caught new exception: " + e.getMessage());
        } finally {
            System.out.println("Final");
        }
    }
    
}
