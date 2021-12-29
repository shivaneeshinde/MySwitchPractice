package FAQ.Imp.array;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] output = new int[2];
		outerloop:
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    break outerloop;
                }
            }
        }
        for(int x: output) {
        	System.out.print(x+" ");
        }

	}

}
