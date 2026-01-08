import java.util.Scanner;

public class Temperature_program {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the temp: ");
        float tempc = sc.nextFloat();
        float tempf = (tempc * 9/5) +32;
        System.out.println(tempf);

    }
}
