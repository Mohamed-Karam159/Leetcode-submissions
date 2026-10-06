class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs[0].length(); // 2
        int i;
        outerLoop:
        for( i =0; i < length; i++){
            char c = strs[0].charAt(i); // a 
            for(int j = 1; j < strs.length; j++){ // strs.length = 2
                if(i < strs[j].length()){
                     if(c != strs[j].charAt(i))
                        break outerLoop;
                }else
                    break outerLoop;
                   
                

            }

        }
        StringBuilder longCommon = new StringBuilder();
        for(int j = 0; j < i; j++)
            longCommon.append(strs[0].charAt(j));
        return longCommon.toString();

    }
}

// ["ab", "a"]  ==> Output ==> "ab"