class Solution {
public:
     bool DFS_Cycle(vector<vector<int>>& Adj, vector<int>& status, int i, vector<int>& Inchain)
    {
        status[i]=1;
        Inchain[i]=1;
        for(int j: Adj[i]){
            if(status[j]==0){
                bool B = DFS_Cycle(Adj, status, j, Inchain);

                if(B==true){
                    return true;
                }
                
            }
            else{ 
                    if(Inchain[j]==1){
                         return true;
                    }
            }
            
        }
        Inchain[i]=0;
        return false;

    }
bool Cycle_Detection(vector<vector<int>> Adj,int V){
        vector<int>status(V,0);
        for(int i=0;i<V;i++){
            if(status[i]==0){
                vector<int>Inchain(V,0);
                bool B = DFS_Cycle(Adj,status,i,Inchain);
                if(B==true){
                    
                    return true;
                }
                
            }
            
            
        }
        return false;
}

    
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<vector<int>>Adj(numCourses);
        int a ,b;
        for(int i=0;i<prerequisites.size();i++){
             
             a = prerequisites[i][0];
             b = prerequisites[i][1];

            Adj[a].push_back(b);

        
      }
      vector<int>ans(numCourses,0);

      vector<int>InDeg(numCourses,0);

      for(int i=0;i<numCourses;i++){
        
        for(int j=0;j<Adj[i].size();j++){
            InDeg[Adj[i][j]]++;
        }
        
    }


    vector<int>vec;


      if(!Cycle_Detection(Adj,numCourses)){
            
          queue<int>q;
        for(int i=0;i<numCourses;i++){
            if(InDeg[i]==0){
                q.push(i);
                vec.push_back(i);
            }
        }
        while(!q.empty()){
            int x = q.front();
            q.pop();
            
            for(int y: Adj[x]){
                InDeg[y]--;
                if(InDeg[y]==0){
                    q.push(y);
                    vec.push_back(y);
                }
            }
        }
        }

        reverse(vec.begin(),vec.end());

        return vec;
        
    }
};