package FAQ.Imp.array;

public class ProductArrayExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int mul = 1;
        for(int i=0; i<nums.length; i++){
            mul= mul*nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                output[i]= mul/nums[i];
            }
            else{
                output[i]= mul;
            }
        }
        return output;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductArrayExceptSelf obj = new ProductArrayExceptSelf();
		int[] nums = {1,2,3,4};
		//int[] nums = {-1,1,0,-3,3};
		int[] output = new int[nums.length];
		output = obj.productExceptSelf(nums);
		for(int x : output) {
			System.out.print(x+" ");
		}
	}

}
