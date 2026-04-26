class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7;
        
        if(n >= 1 && n <= 7) {
            answer = 1;
        } else if(n > 7 && n % pizza <= 0) {
            answer = n / pizza;
        } else if(n > 7 && n % pizza > 0) {
            answer = n / pizza + 1;
        }
        return answer;
    }
}