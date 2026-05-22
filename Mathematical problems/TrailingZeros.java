//Calculate trailing zeros in a factorial
public class TrailingZeros {

    private static int trailingZeros(int num){
        long fact = 1;
        for(int i=1; i <= num; i++){
            fact = fact * i;
        }
        int count = 0;
        while(fact % 10 == 0){
            count ++;
            fact = fact / 10;
        }
        return count;            
    }
    public static void main(String[] args) {
        int num = 19;
        System.out.println(trailingZeros(num));
    }
}
