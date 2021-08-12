import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeTester {

    public boolean isPrime(int n) {
        int sqrt = (int) Math.sqrt(n) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Test
    public void checkPrime() {
        int n = 3;
        boolean prime = isPrime(2);
        assertEquals(prime, true, "not an prime number");


    }

    @Test
    public void printPrime()
    {
     for (int i=1;i<=100;i++)
     {
         if(isPrime(i))
             System.out.println("Prime: "+ i);
     }
    }
}
