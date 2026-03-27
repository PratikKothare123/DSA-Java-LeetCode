package Arrays;

public class BuyAndSellStocks {
    public static int BuyAndSellStocksPrice(int prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(BuyPrice<prices[i]){
                int profit= prices[i]-BuyPrice;
                maxProfit = Math.max(maxProfit, profit); //Today's Profit
            }else{
                BuyPrice = prices[i];
            }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,4,6};
        int result= BuyAndSellStocksPrice(prices);
        System.out.println("Maximun Profit: "+result);
    }
}
