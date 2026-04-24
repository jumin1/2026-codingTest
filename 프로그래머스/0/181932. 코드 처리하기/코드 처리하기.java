class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for(int idx = 0; idx < code.length(); idx++) {
            char c = code.charAt(idx);
            if(mode == 0) {
                ret += c != '1' && idx % 2 == 0 ? c : "";
                mode = c == '1' ? 1 : 0;
            } else if (mode == 1) {
                ret += c != '1' && idx % 2 == 1 ? c : "";
                mode = c == '1' ? 0 : 1;
            }
        }
        
        return ret = ret.equals("") ? "EMPTY" : ret;
    }
}