// 2. Recursion on linked structures (state passed via calls, not loops)

// What you learn: recursion replacing iteration, and modifying structure via return values.

// Reverse a Linked List (recursive)
// Check if a string/array is a Palindrome (recursive, two pointers via recursion)
// Merge two sorted linked lists (recursive)

public class RecursionOnLinkedStructures{

	// static void ReverseLinkedList() //Do this in leetcode

	static boolean checkPalindrome(int[] nums, int left, int right){
		if (left >= right)
			return true;

		if (nums[left] != nums[right])
			return false;

		return checkPalindrome(nums, left + 1, right - 1);
	}
	static boolean checkPalindromeString(String str, int left, int right){
		if (left >= right)
			return true;

		if (str.charAt(left) != str.charAt(right))
			return false;

		return checkPalindromeString(str, left + 1, right - 1);
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 2, 1}; //It should return true
		int[] nums2 = {1, 2,3 , 45}; //It should return false;
		String s = "racecar";
		String s2 = "dukduk";
		System.out.println(checkPalindrome(nums, 0, nums.length - 1));
		System.out.println(checkPalindrome(nums2, 0, nums.length - 1));
		System.out.println(checkPalindromeString(s, 0, nums.length - 1));
		System.out.println(checkPalindromeString(s2, 0, nums.length - 1));
	}
}