/*
 Write a function named largestPrimeFactor that will return the largest prime factor of a number. If the number is <=1 it should return 0. 
 Recall that a prime number is a number > 1 that is divisible only by 1 and
itself, e.g., 13 is prime but 14 is not.

The signature of the function is int largestPrimeFactor(int n)

Examples:
if n is     return  because
    10      5      because the prime factors of 10 are 2 and 5 and 5 is the largest one.
    6936    17     because the distinct prime factors of 6936 are 2, 3 and 17 and 17 is the largest
    1       0      because n must be greater than 1 
 */

public class maxPrimeFactor {
    static int largestPrimeFactor(int n){
        if(n <= 1)
            return 0;
        
        int num = n / 2;
        while(num > 1){
            if(n % num == 0){
                boolean isPrime = true;
                for(int i = 2; i <= num / 2; i++){
                    if(num % i == 0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime)
                    return num;
            }

            num -= 1;
        }

        return n;
    }
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
        System.out.println(largestPrimeFactor(17));
    }
}
