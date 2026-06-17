class Solution {
    public int scoreOfString(String s) {
        int[] arr = new int[s.length()];
        int j=0;
        char[] cha = s.toCharArray();
        for(char ch : cha){
            int c = ch-'0';
            arr[j]=c;
            j++;
        }
        int sum =0;
        for(int i =1;i<arr.length;i++){
           sum += Math.abs(arr[i]-arr[i-1]);
        }
        return sum;
    }
} 