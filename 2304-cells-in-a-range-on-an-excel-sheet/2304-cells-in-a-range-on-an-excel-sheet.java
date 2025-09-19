class Solution {
    public List<String> cellsInRange(String s) {
        List<String> arr = new ArrayList<>();
        char startAlpha = s.charAt(0);
        char startNo = s.charAt(1);
        char endAlpha   = s.charAt(3);
        char endNo   = s.charAt(4);

        for(char ch = startAlpha;ch<=endAlpha;ch++){
            for(char i=startNo;i<=endNo;i++){
                arr.add(""+ch+i);
            }
        }
        return arr;


    }
}