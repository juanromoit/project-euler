import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem_013 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Problem_013_file.txt"));
        BigInteger sum = BigInteger.ZERO;
        while (scanner.hasNextLine()) {
            sum = sum.add(new BigInteger(scanner.nextLine()));
        }
        System.out.println(sum.toString().substring(0, 10));
    }
}