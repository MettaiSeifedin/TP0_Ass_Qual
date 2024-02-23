import org.example.Person;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest
{
    @Test
    public void getFullNameTestShouldReturnFirstNameSpaceLastName(){
        Person p = new Person("A","B",23);
        String result = p.getFullName();
        Assertions.assertEquals("A B",result);
    }
    @Test
    public void isAdultShouldReturnTrueIfAgeIsGreaterThanOrEquals18(){
        Person p = new Person("A","B",18);
        Boolean result = p.isAdult();
        Assertions.assertEquals(true,result);
    }
    @Test
    public void isAdultShouldReturnFalseIfAgeIsLessThan18(){
        Person p = new Person("A","B",17);
        Boolean result = p.isAdult();
        Assertions.assertEquals(false,result);
    }
}
