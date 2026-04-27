class Solution {
    public int solution(int[] array, int height) {
        int cnt = 0;
        for(int i = 0; i < array.length; i++) {
            cnt += array[i] > height ? 1 : 0;
        }
        return cnt;
    }
}