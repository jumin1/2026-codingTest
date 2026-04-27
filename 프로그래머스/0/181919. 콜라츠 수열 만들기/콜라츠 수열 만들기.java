class Solution {
    public int[] solution(int n) {
        int arr[] = new int[1000];
        arr[0] = n;
        int i = 1;
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2; 
            } else {
                n = 3 * n + 1;
            }
            arr[i] = n;
            i += 1;
        }
        int answer[] = new int[i];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = arr[j];
        }
        return answer;
    }
}