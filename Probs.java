/**
 * Find duplication in 1D array
 * 
 * @author skh
 *
 */

public class Probs {

	static int duplicate(int[] arr) throws Exception {
		int length = arr.length;

		int sum1 = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] < 0 || arr[i] > length - 2)
				throw new IllegalArgumentException("Invalid numbers.");

			sum1 += arr[i];
		}

		int sum2 = ((length - 1) * (length - 2)) >> 1;
		return sum1 - sum2;
	}

	public static void main(String[] args) {

		int[] arr = { 0, 2, 1, 3, 2 };

		try {
			System.out.println(duplicate(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
