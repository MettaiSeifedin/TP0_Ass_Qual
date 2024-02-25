import org.example.Prime;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PrimeTest {
@Test
    public void PrimeTestShouldReturnFalseWhenNumberlessThen2(){
    Assertions.assertFalse(Prime.isPrime(1));
}
    @Test
    public void PrimeTestShouldReturnTrueWhenNumberEqual2(){
        Assertions.assertTrue(Prime.isPrime(2));
    }
    @Test
    public void PrimeTestShouldReturnTrueWhenNumberEqual3(){
        Assertions.assertTrue(Prime.isPrime(3));
    }

    @Test
    public void PrimeTestShouldReturnFalseWhenNumberIsGreaterThen3AndNotPrime(){
        Assertions.assertFalse(Prime.isPrime(4));
    }
    @Test
    public void PrimeTestShouldReturnTrueWhenNumberIsGreaterThen3AndPrime(){
        Assertions.assertFalse(Prime.isPrime(4));
    }
}
