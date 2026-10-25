class Solution {
    public int calPoints(String[] operations) {
         ArrayList<Integer> record = new ArrayList<>();

        for (String op : operations) {
            int n = record.size();

            if (op.equals("C")) {
                record.remove(n - 1);
            } 
            else if (op.equals("D")) {
                record.add(2 * record.get(n - 1));
            } 
            else if (op.equals("+")) {
                record.add(record.get(n - 1) + record.get(n - 2));
            } 
            else {
                record.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : record) {
            sum += score;
        }

        return sum;
        
    }
}