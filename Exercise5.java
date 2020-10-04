package recursion;

public class Exercise5 {
    public static int recursion(int n) {
        if (n/10<1) {
            return n;
        }
        else{
            int s=n%10;
            int NextN=n/10;
            return s+recursion(NextN);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(3578)); // вызов рекурсивной функции
    }
}
