public class Factorial {

    public static long factorial(int num){
        long fact = 1;
        for(int i=2; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        int num = 19;
        System.out.println(factorial(num));
    }
}

//code to calculate factorial of a number
