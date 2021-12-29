package FAQ.Imp.Interval;

import java.util.Arrays;

public class MinimumTrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int maxPlatform = 1;
		int neededPlatform = 1;
		
		int i=1, j=0;
		
		while(i<arr.length && j<dep.length) {
			if(arr[i]>dep[j]) {
				j++;
				maxPlatform--;
			}
			else if(arr[i]<dep[j]) {
				i++;
				maxPlatform++;
			}
			neededPlatform = Math.max(neededPlatform, maxPlatform);
		}
		
		System.out.println("Number of platforms needed are: "+neededPlatform);
	}

}
