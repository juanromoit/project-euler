class Problem_001 {
    public static void main(String[] args) {
        int sum = 0;
        for (int dividend = 1; dividend < 1_000; dividend++) {
            if (dividend % 3 == 0 || dividend % 5 == 0) {
                sum += dividend;
            }
        }
        System.out.println(sum);
    }
}