import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    /**
     * Aquí hi podem definir algunes accions que han de ser executades abans de cada test unitari
     */
    @BeforeEach
    void setUp() {
    }

    /**
     * Test unitari per a testejar el mètode Calculadora.suma()
     */
    @Test
    void suma() {
        assertEquals(3, Calculadora.suma(1,2));
    }

    /**
     * Test unitari per a testejar el mètode Calculadora.resta()
     */
    @Test
    void resta() {
        assertEquals(-1, Calculadora.resta(1,2));
    }
}