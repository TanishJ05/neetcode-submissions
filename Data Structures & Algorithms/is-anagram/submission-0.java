class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Integer> table = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
                    table.put(s.charAt(i),
                    table.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);

            if(!table.containsKey(c) || table.get(c)==0){
                return false;
            }

            table.put(c,table.get(c)-1);
        }

        return true;
    }
}