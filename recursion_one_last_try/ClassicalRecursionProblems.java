public class ClassicalRecursionProblems{

	static int fibbonci(int n){ //Nth fibbonaci number
		if (n == 0 || n == 1)
			return n;
		return fibbonci(n - 1) + fibbonci (n - 2);
	}

	static boolean checkSortedArray(int[] nums, int n){
		if (n < 2)
			return true;
		if (nums[n] < nums[n - 1])
			return false;
		return checkSortedArray(nums, n - 1);
	}

	static int binarySearch(int[] nums, int key, int start, int end){
		while (end >= start){
			int mid = start + (end - start) / 2;

		if (nums[mid] == key)
			return mid;
		else if (nums[mid] > key)
			return binarySearch(nums, key, start, mid - 1);
		else
			return binarySearch(nums, key, mid + 1, end);

		}
		return -1; 
	}

	public static void main(String[] args) {
		int[] nums = {4, 5, 6, 7, 87, 98, 101};
		// System.out.println(checkSortedArray(nums, nums.length - 1));
		int idx = binarySearch(nums, 7, 0, nums.length - 1);
		System.out.println(idx);
	}
}