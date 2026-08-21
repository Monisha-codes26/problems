class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
    
        List<Integer> res = new ArrayList<>();
        int  wlen = words[0].length();
        if(s.length() == 0){
            return new ArrayList<>();
        }
        Map<String, Integer> count = new HashMap<>();
        for(String str : words) {
            count.put(str,count.getOrDefault(str, 0) + 1 );
        }
        for(int i = 0; i < wlen; i++){
            
            int left = i;
            int right = i;
            HashMap<String, Integer> curr = new HashMap<>();
            int con = 0;
            while(right + wlen <= s.length()){
            String word = s.substring(right, right + wlen);
            right += wlen;
                if(!count.containsKey(word)) {

                    curr.clear();
                    con = 0;
                    left = right;
                    continue;
                }
                curr.put(word, curr.getOrDefault(word, 0) + 1);
                con++;
                while(count.get(word) < curr.get(word)){

                    String leftWord = s.substring(left, left + wlen);

                    curr.put(leftWord,curr.get(leftWord) - 1);
                    con--;
                    left += wlen;
                }
                if(con == words.length){
                    res.add(left);

                    String leftWord = s.substring(left, left + wlen);

                    curr.put(leftWord,curr.get(leftWord) - 1);
                    left += wlen;
                    con--;
                }
            }
        }
        return res;
    }
}
