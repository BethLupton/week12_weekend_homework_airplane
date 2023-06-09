import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Kylie Minogue", "Captain", "BL74789");
    }

    @Test
    public void hasName() {
        assertEquals("Kylie Minogue", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void hasLicenseNumber() {
        assertEquals("BL74789", pilot.getLicenseNumber());
    }
}
