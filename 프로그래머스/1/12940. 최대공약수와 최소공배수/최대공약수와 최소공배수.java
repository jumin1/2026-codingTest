class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for(int i = 1; i <= (n >= m ? n : m); i++) {
            boolean check1 = n % i == 0 && m % i == 0;
            if(check1) {
                answer[0] = i;
            }
        }
        for(int i = 1; i <= n * m; i++) {
            boolean check2 = i % n == 0 && i % m == 0;
            if(check2) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}