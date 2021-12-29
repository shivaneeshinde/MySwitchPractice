package FAQ.Imp.Interval;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertInterval {
	
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            int[] time = {newInterval[0], newInterval[1]};
            int[][] output = {time};
            return output;
        }
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0] < newInterval[0] && intervals[i][1] > newInterval[1]){
                return intervals;
            }
            else if(intervals[i][0] <= newInterval[0] && intervals[i][1] >= newInterval[0] && intervals[i][1] < newInterval[1]){
                intervals[i][1] = newInterval[1];
                break;
            }
        }
        // now merge the time slots
        LinkedList<int[]> llist = new LinkedList<>();
        int[] arr = {intervals[0][0], intervals[0][1]};
        llist.add(arr);
        for(int i=1; i<intervals.length; i++){
            int lastTime = llist.getLast()[1];
            if(lastTime < intervals[i][0]){
                int[] arr1 = {intervals[i][0], intervals[i][1]};
                llist.add(arr1);
            }
            else if(lastTime <= intervals[i][0]){
                int[] arr1 = {llist.getLast()[0], intervals[i][1]};
                llist.removeLast();
                llist.add(arr1);
            }
        }
        
        return llist.toArray(new int[llist.size()][]);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertInterval obj = new InsertInterval();
//		int[][] intervals = {{1,3},{6,9}};
//		int[] newInterval = {2,5};

		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval = {4,8};
		
//		int[][] intervals = {};
//		int[] newInterval = {5,7};
		
//		int[][] intervals = {[1,5]};
//		int[] newInterval = {2,3};
		
//		int[][] intervals = {[1,5]};
//		int[] newInterval = {2,7};
		
//		int[][] intervals = {[1,5]};
//		int[] newInterval = {6,8};
		
		int[][] output = obj.insert(intervals, newInterval);
		System.out.println(Arrays.deepToString(output));

	}

}
