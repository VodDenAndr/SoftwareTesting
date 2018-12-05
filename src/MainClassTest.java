import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber ()
    {
        int x = this.getLocalNumber();
        int y = 14;
        if (x == y) {
            System.out.println("getLocalNumber равен 14") ;
        } else
            Assert.fail("getLocalNumber равен : " + x + " а не 14");
    }
    @Test
    public void testClassNumber()
    {
        int x = this.getClassNumber();
        int y = 45;
        if (x > y) {
          System.out.println("getClassNumber больше 45") ;
        } else
        Assert.fail("getClassNumber равен " + x + " а это меньше 45");
    }
    @Test
    public void testClassString()
    {
        if (this.getClassString().contains("hello")||this.getClassString().contains("Hello") ){
            System.out.println("ggetClassString cодержит Hello или hello") ;
        } else
            Assert.fail("Строка: " + this.getClassString() + " не содержит Hello или hello");
    }
}

