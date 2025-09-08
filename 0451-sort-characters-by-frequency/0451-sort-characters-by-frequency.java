class Pair {
    String str;
    int freq;

    public Pair(String str, int freq) {
        this.str = str;
        this.freq = freq;
    }

}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->b.freq-a.freq);
        for(char c : map.keySet()){
            pq.add(new Pair(String.valueOf(c),map.get(c)));
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            for(int i=0;i<p.freq;i++){
                sb.append(p.str);
            }
        }

        return sb.toString();
    }
}