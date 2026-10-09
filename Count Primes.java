class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        int cnt = n - 2;
        boolean[] prime = new boolean[n];

        Arrays.fill(prime, true);

        for(int i = 2; i * i < n; i++) {

            if(prime[i]) {
                for(int j = i * i; j < n; j += i) {

                    if(prime[j]) {
                        prime[j] = false;
                        cnt--;
                    }
                }
            }
        }

        return cnt;
    }
}
