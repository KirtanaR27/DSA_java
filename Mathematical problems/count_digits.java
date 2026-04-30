
class CountDigits{

    public static int countDigits(int num){
        int count = 0;
        int n = Math.abs(num);
        if(n == 0)
            return 1;
        while(n > 0){
            n = n/10;
            count ++;
        }
        return count; 
    }

    public static void main(String[] args){
        int num = 2345;
        int no_of_digits = 0;
        no_of_digits = countDigits(num);
        System.out.println(no_of_digits);
    }
}