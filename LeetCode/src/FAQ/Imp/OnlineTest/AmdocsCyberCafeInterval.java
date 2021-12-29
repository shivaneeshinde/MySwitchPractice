package FAQ.Imp.OnlineTest;


import java.util.Arrays;
import java.util.Comparator;


/*
Thoda changes hai merge interval me and counting non merge me
Agar merge karna hai to sort by startTime agar only count to endTime se sort
only count hm startTime sort se bhi kar sakte hai
Bus hme pehle merge karna hoga
Then use
mergeCount + non-mergeCount = total;

non-mergeCount= total - mergeCount;
*/

public class AmdocsCyberCafeInterval {
	
	public static int GreedyAlgo(int[][] inputArray) {
		int[] login = new int[inputArray.length];
		int[] logout = new int[inputArray.length];
		for(int i=0; i<inputArray.length; i++) {
			login[i] = inputArray[i][0];
			logout[i] = inputArray[i][1];
		}
		Arrays.sort(login);
		Arrays.sort(logout);
		int maxPc = 1, neededPc = 1;
		int i=1, j=0;
		while(i<login.length && j<logout.length) {
			if(login[i]<logout[j]) {
				maxPc++;
				i++;
			}
			else if(login[i]>logout[j]) {
				maxPc--;
				j++;
			}
			neededPc = Math.max(maxPc, neededPc);
		}
		return neededPc;
	}
	
    public static void main(String[] args){
        int[][] inputArray1= {{0,30},{5,10},{15,20},{14,21}};
        int[][] inputArray2= {{800,810},{930,1210},{950,1120},{1100,1140},{1500,1910},{1800,2100}};
        
        int noOfPcs = GreedyAlgo(inputArray2);
        System.out.println("Number of Pc's required is: "+noOfPcs);
        
        int[][] inputArray= {{7,10},{2,4}};

        // we have to sort input Array based on startTime, so better 
        // have a class created for the same
        MeetingInterval[] array= new MeetingInterval[inputArray.length];

        // Order of complexity in O(n)
        for(int i=0;i<inputArray.length;i++){
            array[i]= new MeetingInterval(inputArray[i][0], inputArray[i][1]);
        }
        /*
        Sort with respect to end time 
        Why ?
        Because endTime is responsible for the new room
        if a new room is needed this means endtime of 
        the previous occupied must be less then the startime
        here start of meeting is not important

        Example:

        0  -  30
        5  -  10
        14 -  21
        15 -  20

        we have possibilities like
         0 - 30 room 1
         5 - 10 room 2
         14- 21 room 2
         15- 20 room 3
         -------------------
         5 - 10 room 1
         15- 21 room 1
         14- 20 room 2
         0 - 30 room 3
         -------------------
         5 - 10 room 1
         14- 21 room 1
         15- 20 room 2
         0 - 30 room 3
         -------------------
         0 - 30 room 1
         5 - 10 room 2
         15- 20 room 2
         14- 21 room 3

         So the start time doesn't change the number of rooms required

        */

        //Inbuilt sorting O(n*log[n])
        Arrays.sort(array, new Comparator<MeetingInterval>() {

            @Override
            public int compare(AmdocsCyberCafeInterval.MeetingInterval o1, AmdocsCyberCafeInterval.MeetingInterval o2) {
               
                return o1.endTime-o2.endTime;
            }
            
        });
        for(int i=0;i<inputArray.length;i++){
            System.out.println(array[i]);
        }
        MeetingInterval startVal= array[0];
        // if size of inputArray is 1 then atleast 1 room is required
        int count=1;

        //Order of complexity O(n)
        for(int i=1;i<array.length;i++){
            if(startVal.endTime< array[i].startTime){
                startVal.endTime= Math.max(startVal.endTime, array[i].endTime);
             }
             else{
                 count++;
                 startVal.startTime= array[i].startTime;
                 startVal.endTime= array[i].endTime;
             }
        }
        System.out.println(count);
    }

    static class MeetingInterval{
        int startTime;
        int endTime;
        public MeetingInterval(int startTime, int endTime){
            this.startTime=startTime;
            this.endTime=endTime;
        }
        @Override
        public String toString() {
            return "MeetingInterval [endTime=" + endTime + ", startTime=" + startTime + "]";
        }
        
    }
}

// Test it
/*

5  - 10 == startVal
15 - 20
14 - 21
0  - 30 

if(startVal.endTime< array[i].startTime){
   startVal.endTime= Math.max(startVal.endTime, array[i].endTime);
}
else{
    count++;
    startVal.startTime= array[i].startTime;
    startVal.endTime= array[i].endTime;
}


*/