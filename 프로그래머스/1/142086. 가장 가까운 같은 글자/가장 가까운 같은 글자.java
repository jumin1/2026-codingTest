class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            for(int j = s.length() - 1; j >= 0; j--) {
                if(i > j && s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}