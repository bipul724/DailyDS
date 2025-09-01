class Disjoint{
    int parent[];
    int size[];

    public Disjoint(int n){
        parent = new int[n];
        size = new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }

    public int findPair(int u){
        if(parent[u]==u){
            return u;
        }
        parent[u]=findPair(parent[u]);
        return parent[u];


    }

    public void unionBySize(int u,int v){
        int ulp_u = findPair(u);
        int ulp_v = findPair(v);

        if(ulp_u==ulp_v){
            return;
        }
        if(size[ulp_u]>size[ulp_v]){
            parent[ulp_v]=ulp_u;
            size[ulp_u]+=size[ulp_v];
        }
        else{
            parent[ulp_u]=ulp_v;
            size[ulp_v]+=size[ulp_u];
        }
    }


}
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        Disjoint ds = new Disjoint(n);
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(int i=0;i<n;i++){
            List<String> mail = accounts.get(i);
            for(int j=1;j<mail.size();j++){
                String str = mail.get(j);
                if(map.containsKey(str)==false){
                    map.put(str,i);
                }
                else{
                    ds.unionBySize(i,map.get(str));
                }
            }
        }

        ArrayList<String>[] arr = new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<String>();
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String mail = entry.getKey();
            int node = ds.findPair(entry.getValue());
            arr[node].add(mail);
        }

        ArrayList<List<String>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i].size()==0){
                continue;
            }
            List<String> temp = new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            Collections.sort(arr[i]);
            for(String str : arr[i]){
                temp.add(str);
            }
            ans.add(temp);

        }
        return ans;
    }
}