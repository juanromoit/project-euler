import java.math.BigInteger;

public class Problem_048 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int number = 1; number <= 1_000; number++) {
            sum = sum.add(BigInteger.valueOf(number).pow(number));
        }
        String sumStr = sum.toString();
        int sumDigitCount = sumStr.length();
        System.out.println(sumStr.substring(sumDigitCount - 10));
    }
}