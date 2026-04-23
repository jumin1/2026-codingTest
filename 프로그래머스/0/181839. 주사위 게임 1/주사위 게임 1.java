class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        boolean cv1 = a % 2 == 1;
        boolean cv2 = b % 2 == 1;
        if(cv1 && cv2) {
            answer = a*a + b*b;
        } else if (!cv1 && !cv2) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }
        
        return answer;
    }
}