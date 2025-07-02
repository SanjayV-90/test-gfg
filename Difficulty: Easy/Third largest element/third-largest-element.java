class Solution {
    int thirdLargest(int arr[]) {
        int a = arr.length;
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        if(a<3)
            return -1;
            
        for (int value : arr)
        {
            if(value > first)
            {
               third = second;
                second = first;
                
                 first = value;
            }
            
            else if(value > second)
            {
                
                third = second;
                second = value;
            }
            
            else if(value > third)
            {
                third = value;
            }
            
        }
        
        return third;
        
    }
}