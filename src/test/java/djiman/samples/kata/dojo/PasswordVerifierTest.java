package djiman.samples.kata.dojo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import djiman.samples.kata.config.AppConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class PasswordVerifierTest {

	@Autowired
	private PasswordVerifier passwordVerifier;

	@Test
	public void testDoitLeverExceptionSiPwdContientMoinsDe8Caracteres() throws Exception {		
		try {
		passwordVerifier.verify("Xxxxx");
		} catch(Exception e) {
				assertTrue(e.getMessage().contains("Le mot de passe doit contenir plus de 8 caracteres"));
			}
	}
	
	@Test
	public void testDoitLeverUneExceptionSiAucuneLettreMinuscule() throws Exception{
		try {
		passwordVerifier.verify("MOTDEPASSEINCORRECT2");
		} catch(Exception e) {
			assertTrue(e.getMessage().contains("Le mot de passe doit contenir au moins une minuscule"));
		}
	}
	
	@Test
	public void testDoitContenirPlusDe8Caracteres() throws Exception {	
		assertTrue(passwordVerifier.verify("xxxxXxxxx1"));
	}
	
	@Test
	public void testDoitEtreNonNull() throws Exception{	
		assertTrue(passwordVerifier.verify("passwordLong1"));
	}
	
	@Test
	public void testAAuMoinsUneLettreMajuscule() throws Exception{	
		assertTrue(passwordVerifier.verify("motdePassesansmajuscule1"));
	}
	
	@Test
	public void testAAuMoinsUneLettreMinuscule() throws Exception{			
		assertTrue(passwordVerifier.verify("motdePasseAvecMinuscule1"));
	}
	
	@Test
	public void testPwdokSiTroisConditionsReunies() throws Exception{		
		assertTrue(passwordVerifier.verify("motdePasseAvecMinuscule"));
	}
	
	@Test
	public void testAAuMoinsUnChiffre() throws Exception{	
		assertTrue(passwordVerifier.verify("motdePasseCorrect1"));
	}
}
