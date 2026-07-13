class Solution {
    public int solution(int[] numbers, int k) {
        int targetIndex = ((k - 1) * 2) % numbers.length;
        return numbers[targetIndex];
    }
}