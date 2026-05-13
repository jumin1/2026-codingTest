class Solution {
    public int solution(int angle) {
        int answer = 0;
        int[] arr = {0, 90, 91, 180};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= angle) answer++;
        }
        return answer;
    }
}