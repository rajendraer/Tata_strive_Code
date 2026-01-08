import java.util.Scanner;

public class factorial {

    public static Integer fact(int n){
        int ans =1;
        for (int i = 1; i <=n ; i++) {
            ans *= i;
        }
        return ans;
    }

    public  static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}
