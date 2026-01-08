import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // find the largest of the three numbers
        int max = a;

        if (b>max) {
            max = b;}
        if(c>max) {
            max = c;}
        else{
            System.out.println("the input is either invalid or equal");
        }


        System.out.println("the largest number is " + max );


    }

}

