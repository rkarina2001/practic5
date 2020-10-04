package recursion;

public class Exersice6 {
    public static int recursion(double n,double div) {
        if (div <= 1) {
            return 1;
        } else {
            if (n % div == 0) {
                return 0;
            } else {
                return recursion(n,div-1);
            }
        }
    }
    public static void main(String[] args){
        double n=26;
        if (recursion(n,n-1)==1){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

