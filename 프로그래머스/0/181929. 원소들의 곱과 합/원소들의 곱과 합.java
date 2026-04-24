import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int sum = 1;
        int mult = 0;
        for(int i = 0; i < num_list.length; i++) {
            sum *= num_list[i];
            mult += num_list[i];
        }
        int answer = sum < Math.pow(mult, 2) ? 1 : 0;
        return answer;
    }
}