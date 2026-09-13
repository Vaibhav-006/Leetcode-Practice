class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       Set<String> set= new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        Queue<String> q= new LinkedList<>();
        q.add(beginWord);
        int level=1;
        while(!q.isEmpty()){
            int n= q.size();
            for(int i=0; i<n; i++){
                String temp= q.poll();
                if(temp.equals(endWord)){
                    return level;
                }
                char[] arr= temp.toCharArray();
                for(int j=0; j<arr.length; j++){
                    char original= arr[j];
                    for(char k='a'; k<='z'; k++){
                        if(k==original) continue;
                        arr[j]=k;
                        String word= new String(arr);
                        if(set.contains(word)){
                            
                            q.add(word);
                            set.remove(word);
                        }
                    }
                    arr[j]=original;
                }
            }
            level++;
        }
        return 0;
    }
}