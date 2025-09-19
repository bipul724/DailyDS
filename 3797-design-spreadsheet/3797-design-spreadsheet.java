class Spreadsheet {
    public boolean isInteger(String str) {
        return !Character.isLetter(str.charAt(0));
    }

    HashMap<String,Integer> map;
    public Spreadsheet(int rows) {
        this.map = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        map.put(cell,value);
    }
    
    public void resetCell(String cell) {
        map.remove(cell);
    }
    
    public int getValue(String formula) {
        String str[] = formula.substring(1).split("\\+");
        int val1 = 0;
        String s1 = str[0];
        if (isInteger(s1)==true) { 
                val1 += Integer.parseInt(s1);
        } 
        else {
            val1 += map.getOrDefault(s1, 0);
        }


        int val2 = 0;
        String s2 = str[1];
        if (isInteger(s2)==true) { 
                val2 += Integer.parseInt(s2);
        } 
        else {
            val2 += map.getOrDefault(s2, 0);
        }
        
        return val1+val2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */