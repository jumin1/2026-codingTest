import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        int result = 1;
        int cnt = 0;
        if(a != b && b != c && c != a) {
            cnt = 1;
        } else if ( a == b && b == c) {
            cnt = 3;
        } else {
            cnt = 2;
        }
        for(int i = 1; i <= cnt; i++) {
            result *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
        }
        return result;
    }
}