import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
@Test

    public void testGetLocalNumber ()
    {
        int x = this.getClassNumber();
        int y = 45;
        if (x > y) {
          System.out.println("getClassNumber больше 45") ;
        } else
        Assert.fail("getClassNumber равен " + x + " а это меньше 45");
    }
}
