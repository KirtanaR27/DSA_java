
class Test{
    //using String reversal method
    public static boolean isPalindrome(int num){
        String s = Integer.toString(num);
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
        return sb.toString().equals(sb.reverse().toString());
    }

    //using number iteration
    public static boolean isPalindromeNo(int num){
        int reverse = 0;
        int temp = num;
        int lastDigit = 0;

        while(temp != 0){
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp /10;
        }
        return (reverse == num);
    }
    public static void main(String[] args){
        int num = 12345;
        boolean result = isPalindrome(num);
        System.out.print(result);
    }
}