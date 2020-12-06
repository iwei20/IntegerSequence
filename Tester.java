import java.util.NoSuchElementException;

public class Tester {
    public static void main(String[] args) {
        IntegerSequence r = new Range(10,20);
        while(r.hasNext()){
            System.out.print(r.next());
            if( r.hasNext() ) System.out.print( ", " );
        }
        System.out.println();

        IntegerSequence factors = new Range(1, 10);
        int product = 1;
        int exceptionCounter = 0;
        for(int i = 0; i < factors.length() + 5; ++i) {
            try {
                product *= factors.next();
            } catch(NoSuchElementException e) {
                ++exceptionCounter;
            }
        }
        System.out.println("You raised " + exceptionCounter + " exceptions and your product is " + product);
    }
}
