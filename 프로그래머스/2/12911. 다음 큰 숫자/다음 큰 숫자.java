class Solution {
    public int solution(int n) {
        int cnt1 = 0;
        String str1 = Integer.toBinaryString(n);
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == '1') {
                cnt1++;
            }
        }
        int nextNum = n + 1;
        while(true) {
            String str2 = Integer.toBinaryString(nextNum);
            int cnt2 = 0;
            for(int j = 0; j < str2.length(); j++) {
                if(str2.charAt(j) == '1') {
                    cnt2++;
                }
            }
            if(cnt2 == cnt1) {
                break;
            } else {
                nextNum += 1;
            }
        }
        return nextNum;
    }
}