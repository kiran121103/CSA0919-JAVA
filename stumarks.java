package Demo;
import java.util.Scanner;
public class stumarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int subject4 = scanner.nextInt();
        System.out.print("Enter marks for subject 5: ");
        int subject5 = scanner.nextInt();

        int total = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (total / 5.0);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
