class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int count = 0;
            int index = i;
            for(int j = index + 1; j < prices.length; j++) {
                if(prices[j] >= prices[i]) {
                    count++;
                } else {
                    count++;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}