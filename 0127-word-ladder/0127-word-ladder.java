class Pair{
    String word;
    int level;
    public Pair(String word,int level){
        this.word = word;
        this.level = level;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)){
            return 0;
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        
        set.remove(beginWord);

        while(!q.isEmpty()){
            String word = q.peek().word;
            int level = q.peek().level;
            q.remove();

            if(word.equals(endWord)){
                return level;
            }

            for(int i=0;i<word.length();i++){
                
                for(char ch = 'a';ch<='z';ch++){
                    char array[] = word.toCharArray();
                    array[i]=ch;
                    String newWord = new String(array);
                    if(set.contains(newWord)){
                        set.remove(newWord);
                        q.add(new Pair(newWord,level+1));
                    }
                }
            }

        }

        return 0;
    }
}