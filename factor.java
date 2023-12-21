import static java.lang.Math.sqrt;

public class factor {
    public static void main(String[] args) {
        find(20);
    }
//    complexity=0(sqrt(n)) instead of 0(n) which is while using the traditional method
    static void find(int n) {
        for (int i = 1; i <= sqrt(n); i++) {
            if (n % i == 0) {
                if(n/i==i)
                    System.out.print(i+" ");
                else
                    System.out.print(i + " " + n / i+" ");
            }
        }
    }
//    both time and space will be sqrt n
}