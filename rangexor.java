public class rangexor {
    public static void main(String[] args) {
        int a=4;
        int b=9;
//        range xor for a,b =xor(b)^xor(a-1)
//        removes the numbers xor before number a since they wont be exclusive
        int ans=xor(b)^xor(a-1);
        System.out.println(ans);
//        for checking
        int ans2=0;
        for(int i=a;i<=b;i++){
            ans2^=i;
        }
        System.out.println(ans2);
    }
    static int xor(int a) {
        if(a%4==0)
            return a;
        if(a%4==1)
            return 1;
        if(a%4==2)
            return a+1;
        return 0;
    }
}
