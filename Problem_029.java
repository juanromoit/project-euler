import java.math.BigInteger;
import java.util.HashSet;

public class Problem_029 {
    public static void main(String[] args) {
        HashSet<BigInteger> terms = new HashSet<>();
        for (int base = 2; base <= 100; base++) {
            for (int exponent = 2; exponent <= 100; exponent++) {
                terms.add(BigInteger.valueOf(base).pow(exponent));
            }
        }
        System.out.println(terms.size());
    }
}