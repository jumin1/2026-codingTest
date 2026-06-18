class Solution {
    public String solution(String s) {
        String str = s.toLowerCase();
        String[] arr = str.split(" ", -1);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() == 0) {
                continue;
            }
            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }
        return (String.join(" ", arr));
    }
}