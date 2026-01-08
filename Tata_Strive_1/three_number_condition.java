import java.util.Scanner;
public class three_number_condition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        if (a > b && a > c)
        {
            System.out.println("a is the biggest number");
        }
        else if (a < b && b > c)
        {
                System.out.println("b is the biggest number");}
        else
        {System.out.println("c is the biggest number");
                }
        }
    }