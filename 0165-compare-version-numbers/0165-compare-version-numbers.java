class Solution {
    public int compareVersion(String version1, String version2) {
        int n1 = version1.length();
        int n2 = version2.length();
        int i = 0;
        int j = 0;
        char v1, v2;

        while (i < n1 && j < n2) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            while (i<n1 && version1.charAt(i) != '.') {
                v1 = version1.charAt(i);

                sb1.append(v1);

                i++;
            }
            i++;
            while (j<n2 && version2.charAt(j) != '.') {
                v2 = version2.charAt(j);

                sb2.append(v2);

                j++;
            }
            j++;

            String st1 = sb1.toString();
            String st2 = sb2.toString();
            if ((Integer.valueOf(st1)) > (Integer.valueOf(st2))) {

                return 1;

            } else if (Integer.valueOf(st1) < Integer.valueOf(st2)) {

                return -1;

            }

        }
        

        

        while (i < n1 ) {
            StringBuilder sb1 = new StringBuilder();
            
            while (i<n1 && version1.charAt(i) != '.') {
                v1 = version1.charAt(i);

                sb1.append(v1);

                i++;
            }
            i++;
            String st1 = sb1.toString();
            
            if ((Integer.valueOf(st1)) > 0) {

                return 1;

            } 

    }

    while (j < n2 ) {
            StringBuilder sb2 = new StringBuilder();
            
            while (j<n2 && version2.charAt(j) != '.') {
                v2 = version2.charAt(j);

                sb2.append(v2);

                j++;
            }
            j++;
            String st2 = sb2.toString();
            
            if ((Integer.valueOf(st2)) > 0) {

                return -1;

            } 

    }
        



        return 0;
    }

}