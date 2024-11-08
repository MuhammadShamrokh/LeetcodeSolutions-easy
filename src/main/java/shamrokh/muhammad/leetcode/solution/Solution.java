package shamrokh.muhammad.leetcode.solution;


class Solution {
    public double average(int[] salary) {
        int length = salary.length;
        int salarySum = sumArray(salary);
        int maxValue = findMaxValue(salary);
        int minValue = findMinValue(salary);

        return (double)(salarySum - (maxValue+minValue)) / (length-2);
    }

    private int findMaxValue(int[] salary){
        int maxValue = salary[0];

        for(int i=1;i< salary.length;i++){
            if(salary[i]>maxValue)
                maxValue = salary[i];
        }

        return maxValue;
    }

    private int findMinValue(int[] salary){
        int minValue = salary[0];

        for(int i=1;i< salary.length;i++){
            if(salary[i]<minValue)
                minValue = salary[i];
        }

        return minValue;
    }

    private int sumArray(int[] salary){
        int sum=0;

        for(int elem:salary){
            sum+=elem;
        }

        return sum;
    }
}