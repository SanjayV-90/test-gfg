class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        
        
         List<Integer>list = new ArrayList<>();
         
         Map<Integer,Integer> dic = new HashMap<>();
         
         for(int num:arr)
         {
             dic.put(num, dic.getOrDefault(num,0)+1);
         }
         
         for(Map.Entry<Integer,Integer> extra : dic.entrySet() )
         {
             if(extra.getValue() >1 )
             {
                 list.add(extra.getKey());
             }
         }
    
         
         return new ArrayList<>(list);
    }
}