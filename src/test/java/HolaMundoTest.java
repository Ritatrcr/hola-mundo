import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
 
public class HolaMundoTest {
 
    @Test
    void testHolaMundo() {
        String mensaje = "¡Hola Mundo desde CI/CD!";
        assertEquals("¡Hola Mundo desde CI/CD!", mensaje);
    }
}