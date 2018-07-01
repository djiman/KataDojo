package djiman.samples.kata.dojo;

import org.springframework.stereotype.Service;

/**
 * @author gorguindong
 *
 */
@Service
public class PasswordVerifier {
	private int errorCounter = 0;

	/**
	 * @param pPassword
	 * @return
	 * @throws Exception
	 */
	public boolean verify(String pPassword) throws Exception {
		 return passwordIsNotNull(pPassword) 
				&& passwordIsLargerThan8Chars(pPassword) 
				&& haveNotAtLeastOneUpperCaseLetter(pPassword) 
				&& haveNotAtLeastOneLowerCaseLetter(pPassword)
				&& haveNotAtLeastOneNumber(pPassword);
	}

	/**
	 * @param pPassword
	 * @return
	 * @throws Exception 
	 */
	private boolean passwordIsLargerThan8Chars(String pPassword) throws Exception {
		if(pPassword.length() < 8){
			errorCounter++;
			if(errorCounter > 2)
				throw new Exception("Le mot de passe doit contenir plus de 8 caracteres");
		}
		return pPassword.length() > 8;
	}

	/**
	 * @param pPassword
	 * @return
	 * @throws Exception 
	 */
	private boolean passwordIsNotNull(String pPassword) throws Exception {
		if(pPassword == null){
			errorCounter++;
			if(errorCounter > 2)
				throw new Exception("Le mot de Passe doit etre non null");
		}
		return pPassword != null;
	}

	/**
	 * @param pPassword
	 * @return
	 * @throws Exception 
	 */
	private boolean haveNotAtLeastOneNumber(String pPassword) throws Exception {
		for(char carac : pPassword.toCharArray()) {
			if(Character.isDigit(carac)){
				return true;
			}
		}
		errorCounter++;
		if(errorCounter > 2)
			throw new Exception("Le mot de passe doit contenir au moins un nombre");
		return true;
	}

	/**
	 * @param pPassword
	 * @return
	 * @throws Exception 
	 */
	private boolean haveNotAtLeastOneLowerCaseLetter(String pPassword) throws Exception {
		for(char carac : pPassword.toCharArray()){
			if(Character.isLowerCase(carac)){
				return true;
			}
		}
		errorCounter = errorCounter + 3;
		if(errorCounter > 2)
			throw new Exception("Le mot de passe doit contenir au moins une minuscule");
	return true;
	}

	/**
	 * @param pPassword
	 * @return
	 * @throws Exception 
	 */
	private boolean haveNotAtLeastOneUpperCaseLetter(String pPassword) throws Exception {
		for(char carac : pPassword.toCharArray()){
			if(Character.isUpperCase(carac)){
				return true;
			}
		}
		errorCounter++;
		if(errorCounter > 2)
			throw new Exception("Le mot de passe doit contenir au moins une majuscule");
	return true;
	}
}
