package net.azma.codewars;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        // your code
        long[] primeNums = new long[2];
        long[] res = null;
        int k = 0;
        boolean isPrimeNum = false;
        for (long i = m; i <= n; i++) {
            for (long j = 2; j < i; j++) {
                isPrimeNum = i % j != 0;
                if (!isPrimeNum) {
                    break;
                }
            }
            if (isPrimeNum) {
                primeNums[k] = i;
                k++;
            }
            if (k>1) {
                k=1;
                if (primeNums[k] - primeNums[k - 1] == g) {
                    res = new long[]{primeNums[k - 1], primeNums[k]};
                    break;
                } else {
                    k = 0;
                    i--;
                    primeNums[0] = primeNums[1] = 0;
                    res = null;
                }
            }

        }

        return res;
    }

}
