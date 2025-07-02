// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        
        if (arr == null || arr.length == 0) {
            return null; // or throw exception if preferred
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for (int i=1 ; i<arr.length; i++)
        {
            
            if(max < arr[i])
            {
                max = arr[i];
            }
            
            else if (min> arr[i])
            {
                min = arr[i];
            }
            
        }
        
        return new Pair<> (min,max);
        
    }
}
