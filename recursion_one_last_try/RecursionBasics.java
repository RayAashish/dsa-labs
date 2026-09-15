public class RecursionBasics{

	static void printNums(int x, int n){ // Print from 1 to n
		if (x <= n)
			System.out.println(x);
		else
			return;
		printNums(x + 1, n);
	}

	//Use just single parameter for printing from 1 to n. (Think of recursive stack space)
	static void printNums(int n){
		if (n == 0)
			return;
		printNums(n - 1);
		System.out.println(n);

	}

	public static void main(String[] args) {
		printNums(10);
	}
}