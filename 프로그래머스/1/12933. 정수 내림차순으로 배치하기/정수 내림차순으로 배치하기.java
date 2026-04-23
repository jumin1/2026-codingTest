import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        String s = new String(c);
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        answer = Long.parseLong(reversed);
        return answer;
    }
}