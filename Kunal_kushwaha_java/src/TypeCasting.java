import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println(num);
        //Type casting
//        int num = (int)(789.789f);
//        System.out.println(num);
        //Automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);// 257 % 256 = 1
    }
}
