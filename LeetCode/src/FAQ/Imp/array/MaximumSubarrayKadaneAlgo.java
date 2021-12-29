package FAQ.Imp.array;

public class MaximumSubarrayKadaneAlgo {

	public int maxSubArray(int[] nums) {
		int maxVal = Integer.MIN_VALUE;

		return maxVal;
	}

	public static void main(String[] args) {
		// int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums = { 5, 4, -1, 7, 8 };
		MaximumSubarrayKadaneAlgo obj = new MaximumSubarrayKadaneAlgo();
		int max = obj.maxSubArray(nums);
		System.out.println("maximum is: " + max);
	}

}
