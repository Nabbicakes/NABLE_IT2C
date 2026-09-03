import java.util.Scanner;

public class ACT_1 {

    public void userGreeting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Birth Year: ");
        int byear = sc.nextInt();
        System.out.println("=====================================");
        System.out.println("|          GREETINGS! "+name);
        System.out.println("=====================================");
        System.out.println("| Your age is: "+(2026-byear));
        System.out.println("=====================================");

    }
}