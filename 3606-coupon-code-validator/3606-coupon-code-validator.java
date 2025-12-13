class Solution {
    public static boolean validCode(String str){
        String pattern = "^[a-zA-Z0-9_]+$";
        return str.matches(pattern);
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans = new ArrayList<>();
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        // ArrayList<String> dummy = new ArrayList<>();
        // map.put("electronics",dummy); 
        // map.put("grocery",dummy); 
        // map.put("pharmacy",dummy); 
        // map.put("restaurant",dummy); 
        int n = code.length;
        for(int i=0;i<n;i++){
            if(isActive[i]==true){
                if(businessLine[i].equals("electronics")){
                    if(validCode(code[i])){
                        // map.put("electronics",map.get("electronics").add(code[i]));
                        map.computeIfAbsent("electronics", k -> new ArrayList<>()).add(code[i]);

                    }
                }
                if(businessLine[i].equals("grocery")){
                    if(validCode(code[i])){
                        // map.put("grocery",map.get("grocery").add(code[i]));
                        map.computeIfAbsent("grocery", k -> new ArrayList<>()).add(code[i]);
                    }
                }
                if(businessLine[i].equals("pharmacy") ){
                    if(validCode(code[i])){
                        // map.put("",map.get("pharmacy").add(code[i]));
                        map.computeIfAbsent("pharmacy", k -> new ArrayList<>()).add(code[i]);
                    }
                }
                if(businessLine[i].equals("restaurant")){
                    if(validCode(code[i])){
                        // map.put("",map.get("restaurant").add(code[i]));
                        map.computeIfAbsent("restaurant", k -> new ArrayList<>()).add(code[i]);
                    }
                }
            }
            
        }
        for(Map.Entry<String,ArrayList<String>> ele : map.entrySet()){
            Collections.sort(ele.getValue());
        }
        for(Map.Entry<String,ArrayList<String>> ele : map.entrySet()){
            if(ele.getKey()=="electronics"){
                for(String s : ele.getValue()){
                    ans.add(s);
                }
            }
        }
        for(Map.Entry<String,ArrayList<String>> ele : map.entrySet()){
            if(ele.getKey()=="grocery"){
                for(String s : ele.getValue()){
                    ans.add(s);
                }
            }
        }
        for(Map.Entry<String,ArrayList<String>> ele : map.entrySet()){
            if(ele.getKey()=="pharmacy"){
                for(String s : ele.getValue()){
                    ans.add(s);
                }
            }
        }
        for(Map.Entry<String,ArrayList<String>> ele : map.entrySet()){
            if(ele.getKey()=="restaurant"){
                for(String s : ele.getValue()){
                    ans.add(s);
                }
            }
        }


        return ans;
    }
}