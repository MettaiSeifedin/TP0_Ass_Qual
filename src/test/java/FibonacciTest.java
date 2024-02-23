import org.example.Fibonacci;
import org.junit.Test;
    import org.junit.jupiter.api.Assertions;
    public class FibonacciTest {
    @Test
    public void FibonacciTestShouldReturnExceptionWhenNombreIsNegative()
    {
        Assertions.assertThrows(IllegalArgumentException.class,()->Fibonacci.fibonacci(-1));
    }

    @Test
    public void FibonacciTestShouldRerturn0whenNombreis0(){
        int result = Fibonacci.fibonacci(0);
        Assertions.assertEquals(0,result);

    }
        @Test
        public void FibonacciTestShouldRerturn1whenNombreis1(){
            int result = Fibonacci.fibonacci(1);
            Assertions.assertEquals(1,result);

        }
        @Test
        public void FibonacciTestShouldRerturnTheRightResultwhenNombreisbigerthan1(){
            int result = Fibonacci.fibonacci(2);
            Assertions.assertEquals(1,result);

        }
    }
