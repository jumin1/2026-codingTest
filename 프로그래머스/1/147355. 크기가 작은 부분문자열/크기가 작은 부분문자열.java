class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int index = t.length() - p.length();
        long t1 = Long.parseLong(p);
        for(int i = 0; i <= index; i++) {
            String str = t.substring(i, i + p.length());
            long t2 = Long.parseLong(str);
            if(t1 >= t2) {
                answer += 1;
            }
        }
        return answer;
    }
}