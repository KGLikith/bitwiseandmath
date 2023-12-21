//here it will check the prime no. and then all the multiples of that prime no. is rendered as not prime
//(true)in this program and all the nos. which are not checked as false
//and its checked till sqrt of n
//so after the loop breaks the numbers which are false is prime............
public class prime {
    public static void main(String[] args) {
        int n=40;
        boolean [] prime =new boolean[n+1];
// This code snippet uses the Sieve of Eratosthenes algorithm to find all prime numbers up to a given number 'n'. It initializes an array of booleans where false represents a prime number. It then iterates through the array, marking
        sieve(n, prime);
    }
//false in array means it s prime
//    time complexity=(n/2+n/3+n/5+......n/p) p= highest prime no. less than n
//    harmonic program for primes===log(logN)
//   ................................. total time complexity 0(N*N(log(N)))...................
    private static void sieve(int n, boolean[] prime) {
        for (int i = 2; i*i <= n; i++) {
            if(!prime[i]){
                for (int j = i*2; j <=n; j+=i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if(!prime[i]){
                System.out.println(i);
            }
        }
    }
}
