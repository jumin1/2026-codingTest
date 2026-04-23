class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean con1 = false;
        if(ineq.equals(">")){
            if(eq.equals("=")){
                con1 = n >= m;
            } else if (eq.equals("!")){
                con1 = n > m;
            }
        } else if(ineq.equals("<")){
            if(eq.equals("=")){
                con1 = n <= m;
            } else if (eq.equals("!")){
                con1 = n < m;
            }
        }
        if(con1) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}