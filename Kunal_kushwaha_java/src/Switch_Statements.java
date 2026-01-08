import java.util.Scanner;
public class Switch_Statements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        if (fruit.equals("mango")){
            System.out.println("King of fruit");
        }
        if (fruit.equals("Grapes")){
            System.out.println("Small fruit");
        }

    }
}
