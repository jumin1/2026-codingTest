class Solution {
    public int[] solution(int l, int r) {
        int temp[] = new int[r - l + 1];
        int cnt = 0;
        
        for (int i = l; i <= r; i++) {
            boolean con1 = true;
            int n = i;
            while (n > 0) {
                if (n % 10 != 0 && n % 10 != 5) {
                    con1 = false;
                    break;
                }
                n /= 10;
            }
            if (con1) {
                temp[cnt] = i;
                cnt++;
            }
        }

        if (cnt == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}