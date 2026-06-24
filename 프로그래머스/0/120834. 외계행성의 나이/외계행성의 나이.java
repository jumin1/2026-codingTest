class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(age);
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append((char)(c + 49));
        }
        return sb.toString();
    }
}