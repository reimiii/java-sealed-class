package franxx.code.sealedclass.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void reflection() {

        assertTrue(Hello.class.isSealed());

        Class<?>[] permittedSubclasses = Hello.class.getPermittedSubclasses();
        assertEquals(Human.class, permittedSubclasses[0]);
        assertEquals(Animal.class, permittedSubclasses[1]);
    }
}