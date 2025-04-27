import java.util.*;

class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> result = new ArrayList<>();
        List<Transaction> parsed = new ArrayList<>();
        
        for (String t : transactions) {
            String[] parts = t.split(","); // corrected
            String name = parts[0];
            int time = Integer.parseInt(parts[1]);
            int amount = Integer.parseInt(parts[2]);
            String city = parts[3];
            parsed.add(new Transaction(name, time, amount, city, t));
        }
        
        int n = parsed.size();
        for (int i = 0; i < n; i++) { // corrected
            Transaction t1 = parsed.get(i);
            
            if (t1.amount > 1000) {
                result.add(t1.original);
                continue;
            }
            
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                Transaction t2 = parsed.get(j);
                
                if (t1.name.equals(t2.name) && 
                    !t1.city.equals(t2.city) && 
                    Math.abs(t1.time - t2.time) <= 60) {
                    result.add(t1.original);
                    break;
                }
            }
        }
        
        return result;
    }

    static class Transaction {
        String name;
        int time;
        int amount;
        String city;
        String original;

        Transaction(String name, int time, int amount, String city, String original) {
            this.name = name;
            this.time = time;
            this.amount = amount;
            this.city = city;
            this.original = original;
        }
    }
}
