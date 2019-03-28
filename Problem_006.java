class Problem_006 {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        for (int naturalNumber = 1; naturalNumber <= 100; naturalNumber++) {
            sumOfSquares += naturalNumber * naturalNumber;
            squareOfSum += naturalNumber;
        }
        squareOfSum *= squareOfSum;
        System.out.println(squareOfSum - sumOfSquares);
    }
}