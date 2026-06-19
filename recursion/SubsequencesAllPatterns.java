import java.util.*;

class SubsequencesAllPatterns{

	//Print all the sub-sequences

	static void printAllSubWithSumK(int[] arr, int start, List<Integer> ds, int k, int[] sum){
		if (sum[0] == k){
			System.out.println(ds);
		}
		if (sum[0] > k)
			return;

		for (int i = start; i < arr.length; i++){
			ds.add(arr[i]);
			sum[0] += arr[i];
			printAllSubWithSumK(arr, i + 1, ds, k, sum);
			ds.removeLast();
			sum[0] -= arr[i];
		}
	}

	static boolean printOneSubWithSumKFunctionalWay(int[] arr, int start, List<Integer> ds, int k, int[] sum){
		if(sum[0] == k){
			System.out.println(ds);
			return true;
		}
		if (start == arr.length)
			return false;

		for (int i = start; i < arr.length; i++){
			sum[0] += arr[i];
			ds.add(arr[i]);
			if (printOneSubWithSumKFunctionalWay(arr, i + 1, ds, k, sum))
				return true;
			sum[0] -= arr[i];
			ds.removeLast();
		}
		return false;
	}

	static boolean printOneSubWithSumKFunctionalWay2(int[] arr, int i, List<Integer> ds, int k, int sum){
		if (i == arr.length){
			if (sum == k){
				System.out.println(ds);
				return true;
			}
			return false;
		}
		ds.add(arr[i]);
		if (printOneSubWithSumKFunctionalWay2(arr, i + 1, ds, k, sum + arr[i]))
			return true;

		ds.removeLast();
		if (printOneSubWithSumKFunctionalWay2(arr, i + 1, ds, k, sum ))
			return true;

		return false;

	}

	static void countSub(int[] arr, int start, int[] sum, int k, int[] count){
		if (sum[0] == k){
			count[0]++;
		}
		for (int i = start; i < arr.length; i++){
			sum[0] += arr[i];
			countSub(arr, i + 1, sum, k, count);
			sum[0] -= arr[i];
		}
	}

	static int countSub2(int[] arr, int start, int k, int sum){
		int count = 0;
		if (sum == k){
			count++;
		}

		for (int i = start; i < arr.length; i++){
			count += countSub2(arr, i + 1, k, sum + arr[i]);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = {3, 4, 7, 2, 8, 0, 1};
		int k = 7;
		int[] sum = {0};
		int[] count = {0};
		boolean[] flag = {false};
		List<Integer> ds = new ArrayList<>();
		// printAllSubWithSumK(nums, 0, ds, k, sum);
		// printOneSubWithSumKFunctionalWay(nums, 0, ds, k, sum);
		// printOneSubWithSumKFunctionalWay2(nums, 0, ds, k, 0);
		// countSub(nums, 0, sum, 7, count);
		// System.out.println(count[0]);
		System.out.println(countSub2(nums, 0, 7, 0));

	}
}