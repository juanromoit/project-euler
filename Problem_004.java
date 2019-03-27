public class Problem_004 {

    public static void main(String[] args) {
        int largestProduct = -1;
        for (int i = 100; i < 1_000; i++) {
            for (int j = 100; j < 1_000; j++) {
                int product = i * j;
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