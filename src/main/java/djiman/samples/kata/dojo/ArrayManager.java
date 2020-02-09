package djiman.samples.kata.dojo;

import org.springframework.stereotype.Service;

@Service
public class ArrayManager {

	public boolean isIntPresentInArray(int[] pArrayIn, int pNumberToSearch) {
		return binarySearch(pArrayIn, pNumberToSearch, 0, pArrayIn.length - 1);
	}

	private boolean binarySearch(int[] pArrayIn, int pNumberToSearch, int pLeft, int pRight) {

		if(pLeft == pRight) {
			return pArrayIn[pRight] == pNumberToSearch;
		}
		if (pLeft < pRight) {
			int mid = (pRight + pLeft) / 2;
			if (pArrayIn[mid] == pNumberToSearch) {
				return true;
			} else if (pArrayIn[mid] < pNumberToSearch) {
				return binarySearch(pArrayIn, pNumberToSearch, mid + 1, pRight);
			} else if (pArrayIn[mid] > pNumberToSearch) {
				return binarySearch(pArrayIn, pNumberToSearch, pLeft, mid - 1);
			}
			return false;
		}
		return false;
	}

}
