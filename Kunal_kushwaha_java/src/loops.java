import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        //Loop
        /*Syntax for loop
        for (initialization;condition;increment/decrement){
        //body
        }
        */
        //wap to print numbers from 1-5
//        for (int num=1; num <=5; num+=1){
//        System.out.println(num);}

        //print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for(int num=1; num<= n ; num++) {
//            System.out.println("Hello world" );
//        }

        //While loops
        /*Syntax:
        While(condtion){
        body}
        */
//    int num = 1;
//    while(num<=5){
//        System.out.println(num);
//    num +=1;}
    // do-while loop
        /*Syntax:
        do{
        body
        }while(condtion);

         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while(n<=5);
    }











}