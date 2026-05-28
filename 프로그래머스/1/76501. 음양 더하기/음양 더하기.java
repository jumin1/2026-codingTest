class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int total = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == false) absolutes[i] *= -1;
            total += absolutes[i];
        }
        return total;
    }
}