package homework_c4_e4;

public class DigitSum {
    public static int sumDigits(int number) {
        if(number < 10 || number < 0) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(125));  // should return 8
        System.out.println(sumDigits(1));  // should return -1
        System.out.println(sumDigits(-10));  // should return -1
        System.out.println(sumDigits(123456789));  // should return 45
        System.out.println(sumDigits(0));  // should return -1
    }
}
