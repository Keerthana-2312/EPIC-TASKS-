public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        int sum;

        while (num != 1 && num != 4) {
            sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum = sum + (digit * digit);
                num = num / 10;
            }

            num = sum;
        }
        if (num == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}