class Solution {
    public int solution(int[] array) {
        int cnt[] = new int[1000];
        for(int i = 0; i < array.length; i++) {
            int num = array[i];
            cnt[num]++;
        }
        int max = 0;
        int answer = 0;
        boolean isDup = false;
        for(int j = 0; j < cnt.length; j++) {
            if(cnt[j] > max) {
                max = cnt[j];
                answer = j;
                isDup = false;
            } else if(cnt[j] == max && max != 0){
                isDup = true;
            }
        }
        return isDup ? -1 : answer;
    }
}