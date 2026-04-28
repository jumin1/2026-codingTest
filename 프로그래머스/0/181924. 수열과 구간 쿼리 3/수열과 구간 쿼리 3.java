class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int t = 0;
        for(int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
        }
        return answer = arr;
    }
}