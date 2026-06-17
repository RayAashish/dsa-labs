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

	// Print any one sub-sequence (here we are using extra boolean flag but it's better to use functional way to find it)
	static void printOneSubWithSumK(int[] arr, int start, List<Integer> ds, int k, int[] sum, boolean[] flag){
		if (sum[0] == k){
			flag[0] = true;
			System.out.println(ds);
			return;
		}
		if (sum[0] > k)
			return;

		for (int i = start; i < arr.length; i++){
			if (flag[0])
				break;
			ds.add(arr[i]);
			sum[0] += arr[i];
			printOneSubWithSumK(arr, i + 1, ds, k, sum, flag);
			ds.removeLast();
			sum[0] -= arr[i];
		}
	}

	static boolean printOneSubWithSumKFunctionalWay(int[] arr, int start, List<Integer> ds, int k, int[] sum){
		if (sum[0] == k){
			System.out.println(ds);
			return true;
		}

		for (int i = start; i < arr.length; i++){
			ds.add(arr[i]);
			sum[0] = arr[i];
			if (printOneSubWithSumKFunctionalWay(arr, i + 1, ds, k, sum))
				return true;
			ds.removeLast();
			sum[0] -= arr[i];
		}
		return false;
	}



	

	public static void main(String[] args) {
		int[] nums = {3, 4, 7, 2, 8, 0, 1};
		int k = 7;
		int[] sum = {0};
		boolean[] flag = {false};
		List<Integer> ds = new ArrayList<>();
		printOneSubWithSumKFunctionalWay(nums, 0, ds, k, sum);

	}
}