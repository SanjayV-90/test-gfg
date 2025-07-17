class Solution {
    int thirdLargest(int arr[]) {
        
        if(arr.length<3)
        {
            return -1;
        }
        
        else{
            
            int x1=Integer.MIN_VALUE;
            int x2=Integer.MIN_VALUE;
            int x3=Integer.MIN_VALUE;
            
            for (int i=0 ; i<arr.length ; ++i)
            {
                if(x1<arr[i])
                {
                    x3=x2;
                    x2=x1;
                    x1=arr[i];
                }
                else if(x2<arr[i])
                {
                     x3=x2;
                    x2=arr[i];
                }
                else if(x3<arr[i])
                {
                     x3=arr[i];
                }
            }
            return x3;
        }
        
    }
}