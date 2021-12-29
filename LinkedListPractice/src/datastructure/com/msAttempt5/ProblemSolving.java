package datastructure.com.msAttempt5;

// Find duplicate and missing number from an array

public class ProblemSolving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 3, 4, 6 };
		ProblemSolving ps = new ProblemSolving();
		int missing = ps.missing(arr);
		int duplicate = ps.duplicate(arr);
		System.out.println("Missing value is: " + missing);
		System.out.println("Duplicate value is: " + duplicate);

	}

	public int missing(int[] arr) {
		int missing = 0;
		int n = arr.length;
		for (int i = n-1; i >= 0; i--) {
			if (arr[i] != i + 1) {
				missing = i + 1;
				break;
			}
		}
		return missing;
	}

	public int duplicate(int[] arr) {
		int duplicate = 0;
		int n = arr.length;
		/*
		 * HashSet<Integer> set = new HashSet<Integer>(); for(int i=0; i<100; i++){
		 * if(set.contains(i+1)){ // O(1) duplicate = i+1; } set.add(i+1); }
		 */
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return arr[i];
			} else {
				continue;
			}
		}
		return duplicate;
	}

}
