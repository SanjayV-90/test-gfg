class Solution {
    int missingNum(int arr[]) {
        // code here\
       
       
        int n = arr.length+1;
        long ts = (long) n*(n+1)/2;
        
        long tsa = 0;
        
        for(int value : arr)
        {
            tsa+=value;
            
        }
        
        return (int)(ts-tsa);
        
    }
}