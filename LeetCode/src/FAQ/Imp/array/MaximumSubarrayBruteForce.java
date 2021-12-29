package FAQ.Imp.array;

public class MaximumSubarrayBruteForce {
	
	 public int maxSubArray(int[] nums) {
		 int maxVal = Integer.MIN_VALUE;
		 System.out.println("Integer.MIN_VALUE is: "+maxVal);
		 for(int i=0; i<nums.length; i++) {
			 int sum = 0;
			 for(int j=i; j<nums.length; j++) {
				 sum = sum+nums[j];
				 System.out.println("sum is: "+sum);
				 maxVal = Math.max(maxVal, sum);
				 System.out.println("max value is: "+maxVal);
			 }
		 }
		 return maxVal;
	 }

	public static void main(String[] args) {
		//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};		
		int[] nums = {5,4,-1,7,8};
		MaximumSubarrayBruteForce obj = new MaximumSubarrayBruteForce();
		int max = obj.maxSubArray(nums);
		System.out.println("maximum is: "+max);

	}

}
