import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Robert Smith", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Robert Smith", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(1, passenger.getNoBags());
    }
}
