import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = 0;
        int d = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != d) {
                d = arr[i];
                count++;
            }
        }
        int[] answer = new int[count + 1];
        d = arr[0];
        answer[0] = arr[0];
        int idx = 1;
        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != d) {
                d = arr[j];
                answer[idx++] = arr[j];
            }
        }
        return answer;
    }
}