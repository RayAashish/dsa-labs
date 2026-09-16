public class ClassicalRecursionProblems{

	static int fibbonci(int n){ //Nth fibbonaci number
		if (n == 0 || n == 1)
			return n;
		return fibbonci(n - 1) + fibbonci (n - 2);
	}

	static boolean checkSortedArray(int[] nums, int n){
		if (n == 0)
			return true;
		if (nums[n] < nums[n - 1])
			return false;
		return checkSortedArray(nums, n - 1);
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 1};
		System.out.println(checkSortedArray(nums, 4));
	}
}