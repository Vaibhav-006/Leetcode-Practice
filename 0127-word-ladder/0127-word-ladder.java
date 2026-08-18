class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set= new HashSet<>(wordList);
        if(!set.contains(endWord)){
            return 0;
        }
        
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        
        int level=1;
        int len=beginWord.length();
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0; i<size; i++){
                String current = q.poll();
                
                if(current.equals(endWord)){
                    return level;
                }
                
                char[] words=current.toCharArray();
                
                for(int j=0; j<len; j++){
                    char original=words[j];
                    for(char c ='a'; c<='z'; c++){
                        if (c==original) continue;
                        
                        words[j]=c;
                        String next=new String(words);
                        
                        if (set.contains(next)) {
                            set.remove(next);
                            q.offer(next);
                        }
                    }
                    words[j]=original;
                }
            }
            level++;
        }
        
        return 0;
    }
}
