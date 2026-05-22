public class PrimeNumber {
    private static boolean isPrime(int num){
        if(num == 1 || num == 0)
            return false;
        for(int i = 2; i <= num; i = i*i){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 18;
        System.out.println(isPrime(num));
    }   
}