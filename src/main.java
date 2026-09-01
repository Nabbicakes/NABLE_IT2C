import java.util.Scanner;

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========PORTFOLIO OF ACTIVITY======");
        System.out.println(" Name: Mark Roy A. Nable ");
        System.out.println(" Year & Section: IT2C ");
        System.out.println("==================-================");
        System.out.println("=        CONTENT OF ACTIVITY      =");
        System.out.println("===================================");
        System.out.println("1. ACTIVITY 1                     =");
        System.out.println("2. ACTIVITY 2                     =");
        System.out.println("===================================");

        System.out.print("Enter Selected Activity: ");
        int choice = sc.nextInt();

        System.out.println("===================================");

        if(choice == 1) {

            ACT_1 act1 = new ACT_1();
            act1.userGreeting();
        }else{
            System.out.println("Selection not Found!");
        }
}