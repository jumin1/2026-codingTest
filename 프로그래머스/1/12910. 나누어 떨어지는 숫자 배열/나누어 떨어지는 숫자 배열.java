import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                count += 1;
            }
        }
        int[] answer;
        int index = 0;
        if(count == 0) {
            answer = new int[1];
            answer[index] = -1;
        } else {
            answer = new int[count];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % divisor == 0) {
                answer[index++] = arr[i];
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}