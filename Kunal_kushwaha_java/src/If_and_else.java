import java.util.Scanner;

public class If_and_else {
    public static void main(String[] args){

        int salary = 25400;
        if (salary > 10000){
            salary = salary + 200000;
        }else{
            salary = salary +10000;
        }
        System.out.println(salary);
        //multiple if_else statements
        if (salary > 10000){
            salary += 2000;
        }else if (salary >20000){
            salary+=3000;

        }else{
            salary+=1000;
        }



        System.out.println(salary);


    }
}
