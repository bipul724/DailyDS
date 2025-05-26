class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('A',1);
        map.put('e',1);
        map.put('E',1);
        map.put('i',1);
        map.put('I',1);
        map.put('o',1);
        map.put('O',1);
        map.put('u',1);
        map.put('U',1);
        StringBuilder sb = new StringBuilder(s); 
        while(left<right){
            Character l = s.charAt(left);
            Character r = s.charAt(right);

            if(!map.containsKey(l)){
                left++;
            }
            else if(!map.containsKey(r)){
                right--;
            }
            else if(map.containsKey(l) && map.containsKey(r)){
                sb.setCharAt(left,r);
                sb.setCharAt(right,l);
                left++;
                right--;
            }

        }
        return sb.toString();
    }
}