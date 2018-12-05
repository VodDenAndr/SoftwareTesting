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
}
