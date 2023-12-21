public class nonduplicate {
    public static void main(String[] args) {
        int n[]={2,3,4,2,3,4,5};
        System.out.println(not(n));
    }
    private static int not(int[] n) {
          int u=0;
          for(int a:n){
              u^=a;
          }
          return u;
    }
}
