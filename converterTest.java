import org.junit.Test;

import junit.framework.TestCase;

public class converterTest extends TestCase {

    String b = "1111";

    @Test
    public void testValidate()
    {

        boolean esperado = false;
        boolean retorno = converter.validate_input(b);

        assertEquals(esperado, retorno);
    }

    @Test
    public void testBin2Dec()
    {
        int esperado = 15;
        int retorno = converter.bin2dec(b);

        assertEquals(esperado, retorno);
    }

}