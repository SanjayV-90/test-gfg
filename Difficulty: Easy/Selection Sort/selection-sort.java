class Solution {
    void selectionSort(int[] a) {
        for(int i=0 ; i<a.length ; i++)
        {
            int min = i;
            for(int j=i+1 ; j<a.length ; j++)
            {
                if(a[min] > a[j])
                {
                    min = j;
                }
            }
            
            if(i != min )
            {
                int temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
            }
        }
        
    }
}