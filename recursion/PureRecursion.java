/** 1. The base case + trust step (pure recursion, no branching)

What you learn: how to define a contract and trust the smaller call without tracing it.

Factorial(n) — simplest possible contract + trust step
Sum of first n numbers / Power(x, n) — same idea, but forces you to think about how the "smaller problem" combines into the answer
Reverse a string / array using recursion — trust step now transforms data instead of just numbers */

import java.util.Arrays;

public class PureRecursion{

	static int factorial(int n){
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}

	static int sumOfFirstNNumbers(int n){
		if (n == 1)
			return 1;
		return n + sumOfFirstNNumbers(n - 1);
	}

	static int power(int x, int n){
		if (n == 1)
			return x;
		return x * power(x, n - 1);
	}

	static void reverseArray(int[] nums, int l, int r){
		if (l >= r)
			return;
		int temp = nums[l];
		nums[l] = nums[r];
		nums[r] = temp;
		reverseArray(nums, l + 1, r - 1);
	}

	static void reverseString(String str, int l, int r){
		if (l >= r)
			return;
		char temp = str.charAt(l);
		str.charAt(l) = str.charAt(r);
		str.charAt(r) = temp;
		reverseString(str, l + 1, r - 1);
	}

	public static void main(String[] args) {
		int n = 10;
		int[] nums = {1, 2, 3, 4, 5};
		String str = "momo";
		System.out.println(factorial(n));
		System.out.println(sumOfFirstNNumbers(n));
		System.out.println(power(2, 10));
		reverseArray(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
		System.out.println(str, 0, str.length() - 1);
	}
}