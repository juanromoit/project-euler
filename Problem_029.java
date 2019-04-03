import java.math.BigInteger;
import java.util.HashSet;

public class Problem_029 {
    public static void main(String[] args) {
        HashSet<BigInteger> terms = new HashSet<>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                terms.add(BigInteger.valueOf(a).pow(b));
            }
        }
        System.out.println(terms.size());
    }
}