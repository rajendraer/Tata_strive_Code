import java.util.Scanner;

public class calculator_poly {

    void  multiply(int a, int b, int c,int d){
        System.out.println(a*b*c*d);
    }

    void  multiply(int a, int b, int c, int d, int e){
        System.out.println(a*b*c*d*e);
    }

    void  multiply(double a, double b, double c, double d){
        System.out.println(a*b*c*d);
    }

    void  multiply(double a, double b, double c, double d, double e){
        System.out.println(a*b*c*d*e);
    }


    public static  void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter total subjects: ");
        int n = sc.nextInt();
        System.out.println("enter you marks type integer or decimal");
        String dtype = sc.next().toLowerCase();
        calculator_poly obj = new calculator_poly();



        if(!dtype.equals("double") && n==4){
            double[] arr = new double[n];
            for (int i = 0; i <arr.length ; i++) {
                System.out.println("Enter marks: ");
                arr[i] = sc.nextDouble();
            }
            obj.multiply(arr[0],arr[1],arr[2],arr[3]);
        }
        else if(!dtype.equals("double") && n==5){
            double[] arr = new double[n];
            for (int i = 0; i <arr.length ; i++) {
                System.out.println("Enter marks: ");
                arr[i] = sc.nextDouble();
            }
            obj.multiply(arr[0],arr[1],arr[2],arr[3],arr[4]);
        } else if (!dtype.equals("Integer") && n==4) {
            int[] arr = new int[n];
            for (int i = 0; i <arr.length ; i++) {
                System.out.println("Enter marks: ");
                arr[i] = sc.nextInt();
            }
            obj.multiply(arr[0],arr[1],arr[2],arr[3]);
        }
        else if (!dtype.equals("Integer") && n==5) {
            int[] arr = new int[n];
            for (int i = 0; i <arr.length ; i++) {
                System.out.println("Enter marks: ");
                arr[i] = sc.nextInt();
            }
            obj.multiply(arr[0],arr[1],arr[2],arr[3],arr[4]);
        }



    }

}



