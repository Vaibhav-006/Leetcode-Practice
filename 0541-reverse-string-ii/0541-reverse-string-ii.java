class Solution {
    public String reverseStr(String s, int k) {
        char arr[]= s.toCharArray();
        for(int l=0; l<arr.length; l+=2*k){
            int start=l;
            int end=Math.min(l+k-1, arr.length-1);
            while(start<end){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}