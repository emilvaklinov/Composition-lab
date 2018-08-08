import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    Keyboard keyboard;


@Before
public void before(){
    keyboard = new Keyboard("bluetooth");
    }

    @Test
    public void canGetType() {
        assertEquals("bluetooth", keyboard.getType());
    }
    @Test
    public void canSendData() {
        assertEquals("Data sent", keyboard.sendData());
    }

}

