import java.util.*;


/**
 * @author Aashish Ray
 * Understanding backtracking is the most crucial for the entire DSA journey
 * because majority of the complex problems uses the backtracking in it's
 * solution.
 * It's simple that, if you understand the backtracking then only you can do something
 * in the world of DSA
 * */
public class UnderstandingBacktrackingBasics{ 

	/**
	 * This is the most classical problem to understand the backtracking
	*/
	private static void printAllSubsets(int[] nums,int i, int n, List<Integer> subset){
		// if (i == n){
		// 	System.out.println(subset);
		// 	return;
		// }
		// subset.add(nums[i]);
		// printAllSubsets(nums, i + 1, n, subset);
		// subset.removeLast();
		// printAllSubsets(nums, i + 1, n, subset);
		if (i == n)
			return;

		for (int j = 0; j < i; j++){
			System.out.println(subset);
			subset.add(nums[i]);
			printAllSubsets(nums, i + 1, n, subset);
			subset.removeLast();
		}
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		List<Integer> list = new ArrayList<>();
		printAllSubsets(nums, 0, nums.length, list);

	}
}
