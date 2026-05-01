class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean n1 = false;
        boolean n2 = false;
        if(x1 == false && x2 == false){
            n1 = false;
        } else {
            n1 = true;
        }
        if(x3 == false && x4 == false){
            n2 = false;
        } else {
            n2 = true;
        }
        if(n1 == true && n2 == true) {
            return true;
        } else {
            return false;
        }
    }
}