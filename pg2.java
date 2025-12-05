import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = UserMainCode.calculateSum(a,b,c);
        System.out.println(ans);
    }
}
class UserMainCode{
    public static int calculateSum(int a,int b,int c){
        
        if(a==13){
            return c;
        }
        else if (b==13) {
            return b;
        }
        else if(c==13){
            return b;
        }
        else{
            return a + b + c;
        }
        
    }
}