package djiman.samples.kata.dojo;

import org.junit.Test;

import junit.framework.TestCase;

public class PasswordVerifierTest extends TestCase{

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	@Test(expected = Exception.class)
	public void testDoitLeverExceptionSiPwdContientMoinsDe8Caracteres() throws Exception{
		PasswordVerifier passwordVerifier = new PasswordVerifier();
		try {
		passwordVerifier.verify("Xxxxx");
		} catch(Exception e) {
				assertTrue(e.getMessage().contains("Le mot de passe doit contenir plus de 8 caracteres"));
			}
	}
	
	@Test
	public void testDoitLeverUneExceptionSiAucuneLettreMinuscule() throws Exception{
		PasswordVerifier passwordVerifier = new PasswordVerifier();
		try {
		passwordVerifier.verify("MOTDEPASSEINCORRECT2");
		} catch(Exception e) {
			assertTrue(e.getMessage().contains("Le mot de passe doit contenir au moins une minuscule"));
		}
	}
	
	@Test
	public void testDoitContenirPlusDe8Caracteres() throws Exception {
		PasswordVerifier passwordVerifier = new PasswordVerifier();
		assertTrue(passwordVerifier.verify("xxxxXxxxx1"));
	}
	
	@Test
	public void testDoitEtreNonNull() throws Exception{
		PasswordVerifier passwordVerifier = new PasswordVerifier();
		assertTrue(passwordVerifier.verify("passwordLong1"));
	}
	
	@Test
	public void testAAuMoinsUneLettreMajuscule() throws Exception{
		PasswordVerifier passwordVerifier = new PasswordVerifier();
		assertTrue(passwordVerifier.verify("motdePassesansmajuscule1"));
	}
	
	@Test
	public void testAAuMoinsUneLettreMinuscule() throws Exception{
		PasswordVerifier passwordVerifier = new PasswordVerifier();		
		assertTrue(passwordVerifier.verify("motdePasseAvecMinuscule1"));
	}
	
	@Test
	public void testPwdokSiTroisConditionsReunies() throws Exception{
		PasswordVerifier passwordVerifier = new PasswordVerifier();
		assertTrue(passwordVerifier.verify("motdePasseAvecMinuscule"));
	}
	
	@Test
	public void testAAuMoinsUnChiffre() throws Exception{
		PasswordVerifier passwordVerifier = new PasswordVerifier();
		assertTrue(passwordVerifier.verify("motdePasseCorrect1"));
	}
}
