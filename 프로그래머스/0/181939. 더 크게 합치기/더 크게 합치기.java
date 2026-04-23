class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        int i1 = Integer.parseInt(s1 + s2);
        int i2 = Integer.parseInt(s2 + s1);
        if(i1 > i2) {
            answer = i1;
        } else if(i1 < i2) {
            answer = i2;
        } else {
            answer = i1;
        }
        return answer;
    }
}