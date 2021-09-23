import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {


    @Test
    public void testVerificarPalindromo0() {
        String cadena = "aca";
        assertTrue(Palindromo.verificarPalindromo(cadena));
    }

    @Test
    public void testVerificarPalindromo1() {
        String cadena = "202";
        assertTrue(Palindromo.verificarPalindromo(cadena));
    }

    @Test
    public void testVerificarPalindromo2_1() {
        String cadena = "";
        assertFalse(Palindromo.verificarPalindromo(cadena));
    }

    @Test
    public void testVerificarPalindromo2_2() {
        String cadena = null;
        assertFalse(Palindromo.verificarPalindromo(cadena));
    }

    @Test
    public void testVerificarPalindromo3() {
        String cadena = "aaabccbaaa";
        assertTrue(Palindromo.verificarPalindromo(cadena));
    }

    @Test
    public void testVerificarPalindromo4() {
        String cadena = "ahabccbaaa";
        assertFalse(Palindromo.verificarPalindromo(cadena));
    }

    @Test
    public void testVerificarPalindromo5() {
        String cadena = "La tele letal";
        assertTrue(Palindromo.verificarPalindromo(cadena));
    }

    @Test
    public void testVerificarPalindromo6() {
        String cadena = "á";
        assertTrue(Palindromo.verificarPalindromo(cadena));
    }

}