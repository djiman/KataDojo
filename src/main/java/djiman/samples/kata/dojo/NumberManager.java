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

	public int[] trinInsertion(int[] pTabIn) {
		for (int i = 0; i < pTabIn.length; i++) {
			for (int j = i + 1; j < pTabIn.length; j++) {
				if (pTabIn[i] > pTabIn[j]) {
					int temp = pTabIn[j];
					pTabIn[j] = pTabIn[i];
					pTabIn[i] = temp;
				}
			}
		}
		return pTabIn;
	}
}
