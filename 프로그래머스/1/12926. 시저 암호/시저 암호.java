class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c) && c != ' '){
                char temp = (char)(c + n);
                if(temp > 'Z') {
                    temp = (char)(temp - 26);
                }
                answer += temp;
            } else if(Character.isLowerCase(c) && c != ' '){
                char temp = (char)(c + n);
                if(temp > 'z') {
                    temp = (char)(temp - 26);
                }
                answer += temp;
            } else {
                answer += c;
            }
        }
        return answer;
    }
}