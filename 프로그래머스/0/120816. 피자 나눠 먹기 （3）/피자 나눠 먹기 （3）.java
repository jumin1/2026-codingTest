class Solution {
    public int solution(int slice, int n) {
        int pizza = 0;
        while(true){
            if(slice * pizza < n){
                pizza++;
            } else {
                break;
            }
        }
        return pizza;
    }
}