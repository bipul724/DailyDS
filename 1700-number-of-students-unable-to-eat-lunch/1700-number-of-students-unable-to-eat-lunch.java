class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int os = 0 , oS = 0 , zs = 0 , zS= 0;

        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                zs++;
            }
            else{
                os++;
            }
            
        }
        
        for(int num : sandwiches){
            if(num==1){
                if(os==0){
                    return zs;
                }
                os--;
            }
            else{
                if(zs==0){
                    return os;
                }
                zs--;
            }
        }
        return 0;
    }
}