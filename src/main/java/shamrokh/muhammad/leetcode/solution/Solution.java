package shamrokh.muhammad.leetcode.solution;


class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] distributedCandies = new int [num_people];
        int candiesSeparatingIndex = 0;
        int candiesToGive = 1;

        while(candies > 0){
            if(candiesToGive >= candies)
            {
                distributedCandies[candiesSeparatingIndex] += candies;
                candies = 0;
            }
            else{
                distributedCandies[candiesSeparatingIndex] += candiesToGive;
                candies -= candiesToGive;
            }

            candiesToGive++;
            candiesSeparatingIndex = (candiesSeparatingIndex+1)%num_people;
        }

        return distributedCandies;
    }
}