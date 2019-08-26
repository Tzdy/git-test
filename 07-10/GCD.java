public class GCD{
    
    public static void main(String[] args) {
        System.out.println(Lcm(12,15));
    }

    public static int Gcd(int x, int y){
        int num;
        if(x < y){
            num = x;
            x = y;
            y = num;
        }
        if(x % y == 1)
            return 1;
        while(true) {
            if(x % y == 0)
                break;
            num = y;
            y = x % y;
            x = num;    
        }
        return y;
    }

    public static int Lcm(int x, int y){
        return x * y / Gcd(x, y);
    }

}