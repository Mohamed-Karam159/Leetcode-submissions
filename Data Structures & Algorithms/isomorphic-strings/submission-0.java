class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> isoMap = new HashMap<>();
        Map<Character, Character> reversedMap = new HashMap<>();

        if(s.length() != t.length())
            return false;
        for(int i = 0; i < t.length(); i++){
            if(isoMap.containsKey(s.charAt(i))){
                if(isoMap.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
                if (reversedMap.containsKey(t.charAt(i))) {
                     if(reversedMap.get(t.charAt(i)) != s.charAt(i))
                         return false;
                }

          
            isoMap.put(s.charAt(i), t.charAt(i) );
            reversedMap.put(t.charAt(i), s.charAt(i) );
        }
        return true;
    }
}