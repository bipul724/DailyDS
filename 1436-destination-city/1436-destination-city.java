class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<paths.size();i++){
            String city1 = paths.get(i).get(0);
            String city2 = paths.get(i).get(1);

            map.put(city1,map.getOrDefault(city1,0)+1);
            if(!map.containsKey(city2)){
                map.put(city2,0);
            }
            else{
                map.put(city2,map.getOrDefault(city2,0)+1);
            }
            


        }

        String result = "";

        

        for(Map.Entry<String,Integer> city : map.entrySet()){
            if(city.getValue()==0){
                return city.getKey();
            }
        }

        return result;

    }
}