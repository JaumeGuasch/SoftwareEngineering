package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthCardIDTest {
    @Test
    void constructor_and_getters() {
        HealthCardID healthCardID = new HealthCardID("01");
        assertEquals("01", healthCardID.getPersonalID());
        assertNotEquals("02", healthCardID.getPersonalID());
    }

    @Test
    void exceptions() {

    }
    }
}