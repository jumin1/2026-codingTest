class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        int index = -1;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                index = i;
            }
        }
        return sb.append("김서방은 ").append(index).append("에 있다").toString();
    }
}