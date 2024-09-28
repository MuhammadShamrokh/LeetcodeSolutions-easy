package shamrokh.muhammad.leetcode.solution;

class Solution{
    private final int MOD = (int)1e9+7;
    public int numPrimeArrangements(int n) {
        int primeNumbersAmount = numOfPrimeNumberFromOneToNumber(n);

        return (int)((factModuloMOD(primeNumbersAmount)*factModuloMOD(n-primeNumbersAmount))%MOD);
    }

    private int numOfPrimeNumberFromOneToNumber(int number){
        int count = 0;

        // scanning all the numbers from 2 to number to count the primary numbers
        for(int n=2;n<=number;n++){
            boolean isPrime = true;

            // scanning from 2 till sqrt(n) to check if the number is prime
            for(int d=2;d<=Math.sqrt(n);d++){
                // the number is not prime
                if(n%d == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                count++;
        }

        return count;
    }

    private long factModuloMOD(int num){
        long result = 1;

        for(int i=2;i<=num;i++){
            result = (result*i)%MOD;
        }

        return result;
    }
}