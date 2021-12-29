package FAQ.Imp.array;

public class FindMinimumInRotatedSortedArray {
	
	public int findMin(int[] nums) {
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
                break;
            }
        }
        return min;
    }
	public int findMinByPartition(int[] nums) {
        int min = nums[0];
        for(int i=1; i<nums.length; i++) {
        	if(nums[i-1]>nums[i] && nums[i+1]>nums[i]) {
        		min = nums[i];
        		break;
        	}
        }
        return min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3,4,5,1,2 };
		FindMinimumInRotatedSortedArray obj = new FindMinimumInRotatedSortedArray();
		int min = obj.findMin(nums);
		System.out.println(min);
		min = obj.findMinByPartition(nums);
		System.out.println(min);

	}

}
