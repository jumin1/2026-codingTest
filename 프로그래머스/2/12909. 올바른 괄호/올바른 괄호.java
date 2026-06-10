class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else if(s.charAt(i) == ')') {
                count--;
            }
            if(count < 0) {
                return false;
            }
        }
        boolean check1 = count == 0;
        boolean check2 = s.charAt(0) == '(';
        if(check1 && check2) {
            answer = true;
        }
        return answer;
    }
}