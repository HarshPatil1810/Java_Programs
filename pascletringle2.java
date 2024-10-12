class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> row = new ArrayList<>();
        
        // Initialize the first element of the row as 1
        row.add(1);
        
        // Calculate each value for the row based on the previous value
        for (int i = 1; i <= rowIndex; i++) {
            // Add a new value by multiplying the previous value by (rowIndex - i + 1) / i
            // This uses the binomial coefficient formula
            long previousValue = (long) row.get(i - 1) * (rowIndex - i + 1) / i;
            row.add((int) previousValue);
        }
        
        return row;
    }
    
}
