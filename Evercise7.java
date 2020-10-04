package recursion;

public class Evercise7 {
        public static void recursion(int n, int div) {
            if (div > n / 2) {
                System.out.println(n);
                return;
            }
            if (n % div == 0) {
                System.out.println(div);
                recursion(n / div, div);
            }
            else {
                recursion(n, ++div);
            }
        }
        public static void main(String[] args) {
            recursion(234, 2);
        }
}
