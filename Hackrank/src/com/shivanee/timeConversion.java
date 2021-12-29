package com.shivanee;

public class timeConversion {

	public static void main(String[] args) {
		String s = "07:05:45PM";
		String endtime ="";
        String timefactor = s.substring(0,8);
        System.out.println("timefactor: "+timefactor);
        String timeslot = s.substring(8,10);
        System.out.println("timeslot: "+timeslot);
        if(timeslot.equalsIgnoreCase("PM")){
            String[] time = timefactor.split(":");
            int hr = Integer.parseInt(time[0]);
            int finaltime = hr+12;
            endtime = finaltime+":"+time[1]+":"+time[2];
            System.out.println("time: "+endtime);
        }
	}
}
