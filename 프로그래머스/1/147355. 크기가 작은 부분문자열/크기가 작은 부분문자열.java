class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long p1 = Long.parseLong(p);
        for(int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());
            long t1 = Long.parseLong(str);
            if(p1 >= t1) {
                answer++;
            }
        }
        return answer;
    }
}