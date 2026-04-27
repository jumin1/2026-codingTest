class Solution {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        // 2022년 기준 나이 -> 출생 연도로 변환
        // 태어날 때 1살이기에 1을 더해줘야함
        // 따라서 40살 -> 2022 - 40 + 1 -> 1983
        return answer;
    }
}