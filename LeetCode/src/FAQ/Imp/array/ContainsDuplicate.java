package FAQ.Imp.array;

import java.util.Arrays;

public class ContainsDuplicate {
	
	 public boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums);
	        for(int i=1; i<nums.length; i++){
	            if(nums[i] == nums[i-1]){
	                return true;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		ContainsDuplicate obj = new ContainsDuplicate();
		boolean flag = obj.containsDuplicate(prices);
		System.out.println(flag);

	}

}
