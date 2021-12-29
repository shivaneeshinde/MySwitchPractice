package FAQ.Imp.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	
	 public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        if(nums.length>=3){
	            for(int i=0; i<nums.length-2; i++){
	                for(int j=i+1; j<nums.length-1; j++){
	                    for(int k=j+1; k<nums.length; k++){
	                        int temp = nums[i]+nums[j]+nums[k];
	                        if(temp == 0){
	                            List<Integer> index = new ArrayList<Integer>();
	                            index.add(nums[i]);
	                            index.add(nums[j]);
	                            index.add(nums[k]);
	                            Collections.sort(index);
	                            if(!list.contains(index))
	                                list.add(index);
	                        }
	                    }
	                }
	            }
	        }
	        return list;
	    }

	public static void main(String[] args) {
		
		int[] nums = {-1,0,1,2,-1,-4};
		ThreeSum obj = new ThreeSum();
		List<List<Integer>> list = obj.threeSum(nums);
		System.out.println(list.toString());
		
	}

}
