package shamrokh.muhammad.leetcode.solution;

class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double totalTax;
        boolean done = false;

        //first tax
        int taxAmount;
        if(brackets[0][0] < income) {
            taxAmount = brackets[0][0];
        }
        else {
            taxAmount = income;
            done = true;
        }

        int percentage = brackets[0][1];

        totalTax = taxAmount*((double) percentage /100);

        // iterating over the rest of taxes
        for(int i=1;i<brackets.length && !done;i++){
            if(brackets[i][0] < income) {
                taxAmount = brackets[i][0] - brackets[i - 1][0];
            }
            else {
                taxAmount = income - brackets[i - 1][0];
                done = true;
            }

            percentage = brackets[i][1];

            double currentTax = taxAmount*((double) percentage /100);

            totalTax += currentTax;
        }

        return totalTax;
    }
}