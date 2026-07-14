public class NeonNumber {
    public static void main(String[] args) {
        int num = 9;
        int square = num * num;
        int sum = (square / 10) + (square % 10);
        if (sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}