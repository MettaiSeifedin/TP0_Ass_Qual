import org.example.Factorial;
import org.example.Fibonacci;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FactorialTest {
    @Test
    public void FactorialTestShouldReturnIllegalArgumentExceptionWhenNumberIsNegative(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> Factorial.factorial(-1));
    }
    @Test
    public void FactorialTestShouldReturn1WhenNumberIsEqual0(){
        int result = Factorial.factorial(0);
        Assertions.assertEquals(1,result);

    }
    @Test
    public void FactorialTestShouldReturn1WhenNumberIsEqual1(){
        int result = Factorial.factorial(1);
        Assertions.assertEquals(1,result);

    }
    @Test
    public void FactorialTestShouldReturnTheRightFactorialWhenNumberIsGreaterThen1(){
        int result = Factorial.factorial(2);
        Assertions.assertEquals(2,result);

    }
}