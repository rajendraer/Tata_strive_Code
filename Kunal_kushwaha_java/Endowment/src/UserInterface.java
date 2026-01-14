import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Endowment Id");
        String id = sc.nextLine();

        System.out.println("Enter Holder Name");
        String name = sc.nextLine();

        System.out.println("Enter Endowment Type");
        String type = sc.nextLine();

        System.out.println("Enter Registration Date");
        String date = sc.nextLine();

        if (type.equalsIgnoreCase("Educational")) {

            System.out.println("Enter Educational Institution");
            String institution = sc.nextLine();

            System.out.println("Enter Educational Division");
            String division = sc.nextLine();

            EducationalEndowment e = new EducationalEndowment();

            e.setEndowmentId(id);
            e.setHolderName(name);
            e.setEndowmentType(type);
            e.setRegistrationDate(date);
            e.setEducationalInstitution(institution);
            e.setEducationalDivision(division);

            double amount = e.calculateEndowment();
            System.out.printf("Endowment Amount %.2f", amount);
        }

        else if (type.equalsIgnoreCase("Health")) {

            System.out.println("Enter Health Care Center");
            String center = sc.nextLine();

            System.out.println("Enter Holder Age");
            int age = sc.nextInt();

            HealthEndowment h = new HealthEndowment();

            h.setEndowmentId(id);
            h.setHolderName(name);
            h.setEndowmentType(type);
            h.setRegistrationDate(date);
            h.setHealthCareCenter(center);
            h.setHolderAge(age);

            double amount = h.calculateEndowment();
            System.out.printf("Endowment Amount %.2f", amount);
        }

        else {
            System.out.println(type + " is an invalid endowment type");
        }
    }
}
