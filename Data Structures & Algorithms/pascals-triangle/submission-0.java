class Solution {
    public List<List<Integer>> generate(int numRows) { // 3
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i = 0; i < numRows; i++){ //0 < 3
            List<Integer> inList = new ArrayList<>();
            for(int j = 0; j <= i; j++){ //0 <= 0 
            
              if(j == 0 || j == i)
                    inList.add(1);
               else{
                  int sum = mainList.get(i-1).get(j) + mainList.get(i-1).get(j-1); 
                  inList.add(sum);
               }
        }
         mainList.add(inList);
        }
        return mainList;
    }
}