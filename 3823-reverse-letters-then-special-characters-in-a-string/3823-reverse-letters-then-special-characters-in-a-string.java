class Solution {
    public String reverseByType(String s) {
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                letter.add(s.charAt(i));
            }
            else{
                special.add(s.charAt(i));
            }
        }
        int j = letter.size()-1;
        int k = special.size()-1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(letter.get(j));
                j--;
            }
            else{
                sb.append(special.get(k));
                k--;
            }
        }
        return sb.toString();
    }
}