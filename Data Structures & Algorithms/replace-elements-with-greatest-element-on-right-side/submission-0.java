class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] newarr = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(-1);
            }
            newarr[i]=stack.peek();
            if(stack.peek()<arr[i]){
                stack.push(arr[i]);
            }
        }
        return newarr;
        
    }
}