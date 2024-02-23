import org.example.Stack;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.security.PublicKey;

public class StackTest {



    @Test
    public void PushShouldAddElementToTheTopOfTheStack() {
       Stack stack1 = new Stack();
        stack1.push(10);
        Assertions.assertEquals(1,stack1.size());
        Assertions.assertEquals(10,stack1.peek());
    }
    @Test
    public void PushShouldExpandArrayIfStackIsFull(){
        Stack stack1 = new Stack();
        //Remplissage de  la pile
        for (int i=0;i<10;i++)
        {
            stack1.push(i);
        }

        Assertions.assertEquals(10,stack1.size());
        stack1.push(10);
        Assertions.assertEquals(11,stack1.size());
        Assertions.assertEquals(10,stack1.peek());
    }
    @Test
    public void PeekShouldThrowExceptionWhenStackIsEmpty()
    {
        Stack stack1 = new Stack();
        Assertions.assertThrows(IllegalStateException.class,()->stack1.peek());
    }
    @Test
    public void PeekShouldReturnElementTopOfStackWhenStackIsNotEmpty()
    {
        Stack stack1 = new Stack();
        stack1.push(10);
        int result = stack1.peek();
        Assertions.assertEquals(10,result);
    }
    @Test
    public void IsEmptyShouldReturnTrueWhenSatackIsEmpty()
    {
        Stack stack1 = new Stack();
        Assertions.assertTrue(stack1.isEmpty());
    }
    @Test
    public void IsEmptyShouldReturnFalseWhenSatackIsNotEmpty()
    {
        Stack stack1 = new Stack();
        stack1.push(1);
        Assertions.assertFalse(stack1.isEmpty());
    }
    @Test
    public void IsSizeShouldReturnTheSizeOfStack()
    {
        Stack stack1 = new Stack();
        stack1.push(12);
        Assertions.assertEquals(1,stack1.size());
    }
    @Test
    public void PopShouldReturnElementInTheTopWhenStackNotEmpty(){
        Stack stack = new Stack();
        stack.push(10);
        Assertions.assertEquals(1,stack.size());
        int result = stack.pop() ;
        Assertions.assertEquals(0,stack.size());
        Assertions.assertEquals(10,result);
    }
    @Test
    public void PopShouldReturnExceptionWhenStackIsEmpty(){
        Stack stack = new Stack();
        Assertions.assertEquals(0,stack.size());
        Assertions.assertThrows(IllegalStateException.class,()-> stack.pop());
    }
}
