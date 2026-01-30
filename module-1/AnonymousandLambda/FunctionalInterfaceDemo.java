public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        // ===== Anonymous Class =====
        factorial f1 = new factorial() {
            @Override
            public int findFactorial(int n) {
                int fact = 1;
                for (int i = n; i >= 1; i--) {
                    fact = fact * i;
                }
                return fact;
            }
        };

        System.out.println("Anonymous Class Factorial = " + f1.findFactorial(5));

        // ===== Lambda Expression =====
        factorial f2 = (n) -> {
            int fact = 1;
            for (int i = n; i >= 1; i--) {
                fact = fact * i;
            }
            return fact;
        };

        System.out.println("Lambda Expression Factorial = " + f2.findFactorial(6));
    }
}

@FunctionalInterface
interface factorial {
    int findFactorial(int n);
}
