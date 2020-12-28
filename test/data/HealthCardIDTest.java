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

    /*
    LA PROFE VOL POSAR :
    Para el caso de la clase
HealthCardID, podemos definir las dos situaciones siguientes: que al constructor le llegue
null (objeto sin instanciar), y también un código de identificación mal formado.
     */
    @Test
    void exceptions() {

    }
   
}
