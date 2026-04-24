class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < num_list.length; i++) {
            cnt += num_list[i] == n ? 1 : 0;
            if(cnt >= 1) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}