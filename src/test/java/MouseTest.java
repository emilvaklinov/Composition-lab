import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    String type;
    int buttons;
    Mouse mouse1;
    Mouse mouse2;

    @Before
    public void before() {
        mouse1 = new Mouse("Wireless", 2);
        mouse2 = new Mouse("Wired", 6);
    }

    @Test
    public  void canGetType(){
        assertEquals("Wireless", mouse1.getType());
    }

    @Test
    public void canGetButton(){
        assertEquals(2, mouse1.getButtons());
    }

    @Test
    public void canClickButton(){
        assertEquals("Click", mouse2.clickButton());
    }

    @Test
    public void canSendData(){
        assertEquals("Data sent", mouse1.sendData());
    }
}
