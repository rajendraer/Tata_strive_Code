import java.util.Scanner;
public class grade {
    //90 a
    //80 b
    //70 c
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks=sc.nextInt();
        switch(marks)
        {
            case 90: {System.out.println("Grade ia A");}
            break;

            case 80: {System.out.println("Grade ia B");}
            break;

            case 70: {System.out.println("Grade ia C");}
            break;

            default:
            {System.out.println("fail");
                break;}
        }
    }
}
// we cannot take range for input here we need to do if else //