import java.util.*;

class Subsequences{

	// static void subsequences(int[] nums, int i, List<Integer> ds){
	// 	if (i == nums.length){
	// 		System.out.println(ds);
	// 		return;
	// 	}
	// 	ds.add(nums[i]);
	// 	subsequences(nums, i + 1, ds);
	// 	ds.removeLast();
	// 	subsequences(nums, i + 1, ds);
	// }

	static void subsequences(int[] nums, int i, List<Integer> ds){ //Better approach
		for (int j = i; j < nums.length; j++){
			ds.add(nums[j]);
			subsequences(nums, j + 1, ds);
			ds.removeLast();
		}
		System.out.println(ds);
	}

	public static void main(String[] args) {
		int[] nums = {3, 1, 2};
		List<Integer> ds = new ArrayList<>();
		subsequences(nums, 0, ds);
	}


}