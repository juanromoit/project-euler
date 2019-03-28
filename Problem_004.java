public class Problem_004 {

    public static void main(String[] args) {
        int largestProduct = -1;
        for (int multiplicand = 100; multiplicand < 1_000; multiplicand++) {
            for (int multiplier = 100; multiplier < 1_000; multiplier++) {
                int product = multiplicand * multiplier;
                if (isPalindrome(product) && product > largestProduct) {
                    largestProduct = product;
                }
            }
        }
        System.out.println(largestProduct);
    }

    private static boolean isPalindrome(int number) {
        String numberStr = Integer.toString(number);
        String numberStrRev = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(numberStrRev);
    }
}