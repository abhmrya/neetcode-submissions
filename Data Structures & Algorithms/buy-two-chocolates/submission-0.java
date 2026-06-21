class Solution {
    public int buyChoco(int[] prices, int money) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0 ; i < prices.length ; i++){
            pq.add(prices[i]);
        }
        int sum =0;
        int j=0;
        while(!pq.isEmpty() && j<2){
            sum+=pq.poll();
            j++;
        }
        if(sum<=money){
            return money-sum;
        }
        return money;
    }
}