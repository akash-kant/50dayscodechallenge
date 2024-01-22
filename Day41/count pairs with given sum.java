

//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int b=k-arr[i];
            if(hm.containsKey(b)){
                count+=hm.get(b);
            }
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }
        return count;
    }
}
