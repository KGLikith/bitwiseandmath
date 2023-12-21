public class ithbit {
    public static void main(String[] args) {
        int n=7;
        int i=2;
        System.out.println(n&(1<<(i-1)));
        System.out.println((1 << (i - 1)) | n);
//        System.out.println(!((1<<(i- 1)) & n));
    }
}
