class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=1 ; i<arr.length ;i++)
        {
            int temp= arr[i] , j=i;
            while(j>0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
            
        }
    }
}