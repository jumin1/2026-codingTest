class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int total = 0;
        for(int i = 0; i < absolutes.length; i++) {
            total += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return total;
    }
}