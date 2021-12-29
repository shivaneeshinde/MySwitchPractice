package datastructure.com.interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class JPMorgan {

    /*
     * Complete the 'toolchanger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY tools
     *  2. INTEGER startIndex
     *  3. STRING target
     */

    public static int toolchanger(List<String> tools, int startIndex, String target) {
        int count = 0;
        int smoves = 0;
        int bmoves = 0;
        int dis = 0;
        int index = startIndex;
        if(startIndex < tools.size()){
            while(count < tools.size()){
                if(index<tools.size() && tools.get(index).equals(target)){
                    break;
                }
                else{
                    smoves++;
                    if(index>=tools.size()){
                        index = 0;
                        count++;
                    }
                    else{
                        count++;
                        index++;
                    }             
                }
            }
            count = 0;
            index = startIndex;
            while(count < tools.size()){
                if(tools.get(index).equals(target)){
                    break;
                }
                else{
                    bmoves++;
                    if(index<=0){
                        index = tools.size()-1;
                        count++;
                    }
                    else{
                        count++;
                        index--;
                    }             
                }
            }
            dis = (smoves < bmoves) ? smoves : bmoves;
        }
        else{
            dis = 1;
        }
        return dis;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("abs");
		list.add("adasd");
		list.add("erwer");
		list.add("vdfgd");
		int count = toolchanger(list, 1, "abs");
		System.out.println(count);
	}

}
