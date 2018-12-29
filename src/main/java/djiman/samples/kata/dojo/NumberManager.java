package djiman.samples.kata.dojo;

import org.springframework.stereotype.Service;

/**
 * @author gorguindong
 *
 */
@Service
public class NumberManager {

	/**
	 * @param pNumber
	 *            number
	 * @return True/False prime number
	 */
	public boolean isPrimeNumber(int pNumber) {
		if (pNumber <= 1) {
			return false;
		}
		if (pNumber != 2 && pNumber % 2 == 0) {
			return false;
		}

		if (pNumber != 3 && pNumber % 3 == 0) {
			return false;
		}
		return true;
	}

}
