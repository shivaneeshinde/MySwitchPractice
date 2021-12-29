package FAQ.Imp.Interval;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

	 public int[][] merge(int[][] intervals) {
	        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
	        LinkedList<int[]> list = new LinkedList<>();
	        int[] arr = {intervals[0][0], intervals[0][1]};
	        list.add(arr);
	        for(int i=1; i<intervals.length; i++){
	            int[] curr = list.getLast();
	            if(curr[1] < intervals[i][0]){
	                int[] temp = {intervals[i][0], intervals[i][1]};
	                list.add(temp);
	            }
	            else if(curr[1]>=intervals[i][0] && curr[1] < intervals[i][1]){
	                int[] temp = {curr[0], intervals[i][1]};
	                list.removeLast();
	                list.add(temp);
	            }
	        }
	        return list.toArray(new int[list.size()][]);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		MergeIntervals obj = new MergeIntervals();
		int[][] output = obj.merge(intervals);
		System.out.println(Arrays.deepToString(output));

	}

}
