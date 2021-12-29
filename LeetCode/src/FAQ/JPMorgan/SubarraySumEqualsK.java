package FAQ.JPMorgan;

public class SubarraySumEqualsK {
	
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int window = 0;
        int pointer = 0;
        for(int i=0; i<nums.length; i++){
            window = window + nums[i];
        	System.out.println("till i "+i+" window is: "+window);
            if(window == k){
                count++;
            }
            else if(window>k){
                int j = pointer;
                while(window >= k){
                    if(window == k){
                    	System.out.println("window inside j if loop"+window);
                        count++;
                        break;
                    }
                    else{
                        window = window - nums[j];
                        j++;
                        pointer = j;
                        System.out.println("window inside j else loop"+window);
                    }
                }
                
            }
            System.out.println("count is: "+count);
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,2,1};
		int k = 3;
		
		SubarraySumEqualsK obj = new SubarraySumEqualsK();
		int count = obj.subarraySum(nums, k);
		System.out.println(count);

	}

}
