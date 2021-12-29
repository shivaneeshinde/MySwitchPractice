package FAQ.Imp.array;

public class BestTimeToBuyNSellStock {
	
	public int maxProfit(int[] prices) {
        int min = prices[0];
        int minIndex = 0;
        int max = 0;
        for(int i=1; i<prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
                minIndex = i;
            }
        }   
        if(minIndex == prices.length-1)
            return 0;
        else{     
            max = prices[minIndex+1];
            int maxIndex = minIndex+1;     
            for(int i=maxIndex; i<prices.length; i++){         
                if(max < prices[i]){
                    max = prices[i];
                    maxIndex = i;
                }
            }       
        }
        return max-min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		BestTimeToBuyNSellStock obj = new BestTimeToBuyNSellStock();
		int cost = obj.maxProfit(prices);
		System.out.println(cost);

	}

}
