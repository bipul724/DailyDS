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
        int sum = 0;
        for(String s : str){
            if (isInteger(s)==true) { 
                sum += Integer.parseInt(s);
            } else {
                sum += map.getOrDefault(s, 0);
            }
        }
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */