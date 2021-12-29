package datastructure.com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MorganStanley2 {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int total= Integer.parseInt(br.readLine());
        int num= Integer.parseInt(br.readLine());
        long[][] array= new long[num+1][total+1];
        long mod= 1000000007;
        for(int i=0;i<=num;i++){
            array[0][i]=0;
            array[i][0]=1;
        }
        for(int i=1;i<=num;i++){
            for(int j=1;j<=total;j++){
                if(i>j){
                    array[i][j]=array[i-1][j]%mod;
                    continue;
                }
                array[i][j]=array[i-1][j] % mod +array[i][j-i] %mod;
            }
        }
        System.out.println(array[num][total]);
	}

}
