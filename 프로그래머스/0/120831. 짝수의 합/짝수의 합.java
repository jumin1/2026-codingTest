class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i = 2; i <= n; i++) {
            result += i % 2 == 0 ? i : 0;
        }
        return result;
    }
}