package djiman.samples.kata.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for StringCalculator
 */
public class StringCalculatorTest
   
{
	@Test
    public void testDoitRetourner0AvecVideEnEntree() throws Exception
    {
       StringCalculator stringCalculator = new StringCalculator();
       assertEquals(0, stringCalculator.add(""));
    }
    @Test
    public void testDoitRetourner1Avec1EnEntree() throws Exception{
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    public void testDoitRetourner3Avec1Et2EnEntree() throws Exception{
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test(expected=Exception.class)
    public void testExeptionSiNombreNegatifEntree() throws Exception{
    	StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.add("-1,2");
    }
    
    @Test
    public void testDoitGererLeSeparateurRetourAlaLigne() throws Exception{
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    
    @Test
    public void testDoitIgnorerLesNombresSupA1000() throws Exception{
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(2, stringCalculator.add("2,10001"));
    }
    
    @Test
    public void testDoitGererPlusieursOccurencesDUnSeparateur() throws Exception{
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("1,***,,\n\n2\n****3"));
    }
}
