package FAQ.Imp.array;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int area = 0;
		int[] leftMax = new int[height.length];
		int[] rightMax = new int[height.length];
		int left = height[0];
		leftMax[0] = left;
		for (int i = 1; i < height.length; i++) {
			left = Math.max(left, height[i]);
			leftMax[i] = left;
		}
		int right = height[height.length - 1];
		rightMax[height.length - 1] = right;
		for (int i = height.length - 1; i >= 0; i--) {
			right = Math.max(right, height[i]);
			rightMax[i] = right;
		}
		for (int i = 0; i < height.length; i++) {
			System.out.println("left of index: " + i + " is: " + leftMax[i]);
			System.out.println("right of index: " + i + " is: " + rightMax[i]);
			area += Math.min(leftMax[i], rightMax[i]) - height[i];
		}
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		ContainerWithMostWater obj = new ContainerWithMostWater();
		int water = obj.maxArea(height);
		System.out.println(water);

	}

}
