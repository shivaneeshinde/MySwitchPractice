package com.shivanee;

import java.util.ArrayList;
import java.util.List;

public class Between2Set {
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(4);
		List<Integer> b = new ArrayList<>();
		b.add(16);
		b.add(32);
		b.add(64);
		int count = 0;
        int min =a.get(0); int max = 0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<min)
                min = a.get(i);
        }
        System.out.println("min: "+min);
        for(int i=0;i<b.size();i++){
            if(b.get(i)>max)
                max = b.get(i);
        }
        System.out.println("max: "+max);
        for(int i=min;i<max;i++){
            int count1=0;
            int count2=0;
            System.out.println("i: "+i);
            for(int j=0;j<a.size();j++){
            	System.out.println("a.get(j): "+a.get(j));
                if(i%a.get(j)==0)
                    count1++;
            }
            if(count1==a.size()){
                for(int j=0;j<b.size();j++){
                    if(b.get(j)%i==0)
                        count2++;
                }
            }
            if(count2==b.size())
                count++;
        }
        System.out.println(count);
	}

}
