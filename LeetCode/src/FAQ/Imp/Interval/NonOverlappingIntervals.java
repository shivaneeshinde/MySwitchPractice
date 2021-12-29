package FAQ.Imp.Interval;

import java.util.Arrays;
import java.util.LinkedList;

public class NonOverlappingIntervals {

	public int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		System.out.println(Arrays.deepToString(intervals));
		int count = 0;
		LinkedList<int[]> list = new LinkedList<>();
		for (int i = 0; i < intervals.length; i++) {
			int[] arr = { intervals[i][0], intervals[i][1] };
			if (list.size() == 0) {
				list.add(arr);
			} else {
				int[] tail = list.getLast();
				if (tail[1] <= intervals[i][0] && tail[1] < intervals[i][1]) {
					list.add(arr);
				} else if (tail[0] >= intervals[i][0] && tail[1] <= intervals[i][1]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		NonOverlappingIntervals obj = new NonOverlappingIntervals();
		// int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		// int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
		int[][] intervals = { { 1, 100 }, { 11, 22 }, { 1, 11 }, { 2, 12 } };
		int count = obj.eraseOverlapIntervals(intervals);
		System.out.println(count);
	}

}
