package djiman.samples.kata.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import djiman.samples.kata.config.AppConfig;

/**
 * Unit test for StringCalculator
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class StringCalculatorTest {

	@Autowired
	private StringCalculator stringCalculator;

	@Test
	public void testDoitGererLeSeparateurRetourAlaLigne() throws Exception {
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}

	@Test
	public void testDoitGererPlusieursOccurencesDUnSeparateur() throws Exception {
		assertEquals(6, stringCalculator.add("1,***,,\n\n2\n****3"));
	}

	@Test
	public void testDoitIgnorerLesNombresSupA1000() throws Exception {
		assertEquals(2, stringCalculator.add("2,10001"));
	}

	@Test
	public void testDoitRetourner0AvecVideEnEntree() throws Exception {
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	public void testDoitRetourner1Avec1EnEntree() throws Exception {
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	public void testDoitRetourner3Avec1Et2EnEntree() throws Exception {
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test(expected = Exception.class)
	public void testExeptionSiNombreNegatifEntree() throws Exception {
		stringCalculator.add("-1,2");
	}
}
