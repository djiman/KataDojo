package djiman.samples.kata.dojo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import djiman.samples.kata.config.AppConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class NumberManagerTest {

	@Autowired
	NumberManager numberManager;

	@Test
	public void testIsPrimeNumber_CinqEstUnNombrePremier() {
		assertTrue(numberManager.isPrimeNumber(5));
	}

	@Test
	public void testIsPrimeNumber_DeuxEstUnNombrePremier() {
		assertFalse(numberManager.isPrimeNumber(1));
	}

	@Test
	public void testIsPrimeNumber_EntiersNegatifsNeSontPasPremiers() {
		assertFalse(numberManager.isPrimeNumber(-2));
	}

	@Test
	public void testIsPrimeNumber_NeufNEstPasUnNombrePremier() {
		assertFalse(numberManager.isPrimeNumber(9));
	}

	@Test
	public void testIsPrimeNumber_QuatreNEstPasUnNombrePremier() {
		assertFalse(numberManager.isPrimeNumber(4));
	}

	@Test
	public void testIsPrimeNumber_SeptEstUnNombrePremier() {
		assertTrue(numberManager.isPrimeNumber(7));
	}

	@Test
	public void testIsPrimeNumber_SixNEstPasUnNombrePremier() {
		assertFalse(numberManager.isPrimeNumber(6));
	}

	@Test
	public void testIsPrimeNumber_SoixanteEtUnEstUnNombrePremier() {
		assertTrue(numberManager.isPrimeNumber(61));
	}

	@Test
	public void testIsPrimeNumber_TroisEstUnNombrePremier() {
		assertTrue(numberManager.isPrimeNumber(3));
	}

	@Test
	public void testIsPrimeNumber_UnNEstPasUnNombrePremier() {
		assertFalse(numberManager.isPrimeNumber(1));
	}

	@Test
	public void testIsPrimeNumber_VingtTroisEstUnNombrePremier() {
		assertTrue(numberManager.isPrimeNumber(23));
	}

	@Test
	public void testIsPrimeNumber_ZeroNEstPasUnNombrePremier() {
		assertFalse(numberManager.isPrimeNumber(0));
	}

}
