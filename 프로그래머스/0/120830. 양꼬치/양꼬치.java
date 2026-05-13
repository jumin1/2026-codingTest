class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        n *= 12000;
        k = (k - service) * 2000;
        return n + k;
    }
}