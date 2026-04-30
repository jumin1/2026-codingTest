class Solution {
    public int[] solution(int[] arr) {
        int[] temp = new int[arr.length];
        int i = 0;
        int top = -1;
        while (i < arr.length) {
            if (top == -1) {
                temp[++top] = arr[i];
                i++;
            } else if (temp[top] < arr[i]) {
                temp[++top] = arr[i];
                i++;
            } else {
                top--; 
            }
        }
        int[] result = new int[top + 1];
        for (int j = 0; j <= top; j++) {
            result[j] = temp[j];
        }
        return result;
    }
}