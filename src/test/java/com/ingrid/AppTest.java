package com.ingrid;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testeSomaSimples() {
        int resultado = App.somar(10, 20);
        assertEquals(30, resultado, "A soma de 10 + 20 deve ser 30");
    }
}
