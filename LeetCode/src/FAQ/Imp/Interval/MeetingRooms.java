package FAQ.Imp.Interval;

import java.util.Arrays;
import java.util.LinkedList;

/* Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
*/

public class MeetingRooms {

	public boolean canAttendMeetings(int[][] intervals) {
		boolean flag = true;
		Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
		LinkedList<int[]> list = new LinkedList<>();
		for(int i=0; i<intervals.length; i++) {
			int[] arr = {intervals[i][0], intervals[i][1]};
			if(list.size()==0) {
				list.add(arr);
			}
			else {
				int[] curr = list.getLast();
				if(curr[1]<=intervals[i][0]) {
					list.add(arr);
				}
				else {
					return false;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingRooms obj = new MeetingRooms();
		//int[][] intervals = {{0,30},{5,10},{15,20}};
		//int[][] intervals = {{7,10},{2,4}};
		int[][] intervals = {{13,15},{1,13}};
		boolean flag = obj.canAttendMeetings(intervals);
		System.out.println(flag);
	}

}
