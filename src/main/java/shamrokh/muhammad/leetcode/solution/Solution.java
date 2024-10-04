package shamrokh.muhammad.leetcode.solution;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double slope = 0;
        boolean isInfinity=false;
        // it is guarantee that we have more than two points
        if(coordinates[1][0] != coordinates[0][0])
            slope= (double)(coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        else
            isInfinity = true;

        // iterating over points to check that all the points have the same slope with the first point
        for(int i=2;i<coordinates.length;i++){
            if(coordinates[i][0] != coordinates[0][0]) {
                if(isInfinity)
                    return false;

                if ((double) (coordinates[i][1] - coordinates[0][1]) / (coordinates[i][0] - coordinates[0][0]) != slope) {
                    return false;
                }
            } else {
                if (!isInfinity) {
                    return false;
                }
            }
        }

        return true;
    }
}