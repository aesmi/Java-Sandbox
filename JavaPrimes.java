//Video on Tail Recursion: https://www.youtube.com/watch?v=_JtPhF8MshA

public class JavaPrimes {
    public static void main(String[] args) {
        // converts string argument in main to integer for use in printPrimes method
        printPrimes(Integer.parseInt(args[0]));
    }

    private static void printPrimes(int limit) {
        isPrime(4);
    }

    // testing for primes
    // we dont use void since we are returning a boolean
    private static boolean isPrime(int x) {
        if (x < 1)
            return false;
        else
            //method used to check if n is divisible by k with no remainder
            //we use not to flip boolean
            return !isDivisible(x, 2);
    }
    // min, max basically range
    private static boolean isDivisible(int x, int y){
        return false;
    }
}
