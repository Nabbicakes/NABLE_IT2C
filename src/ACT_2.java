import java.util.Scanner;

public class ACT_2 {

    public void userGreeting() {
        Scanner sc = new Scanner(System.in);

                System.out.println("========================================");
                System.out.println("|         CINEMA TICKET SYSTEM         |");
                System.out.println("========================================");
                System.out.println("| Select Format                        |");
                System.out.println("| 1: REGULAR                           |");
                System.out.println("| 1: 3D                                |");
                System.out.println("| 1: IMAX                              |");
                System.out.println("========================================");
                System.out.print("Enter Selected Format: ");
                int choice = sc.nextInt();

                System.out.println("========================================");
                System.out.println("Enter Screening Hour (24-Hour Format, e.g., 18)");
                System.out.print("Enter Selected Time: ");
                int hour = sc.nextInt();

                String screeningFormat = "" ;
                double basePrice = 0;
                double peakFee = 0;


                if (choice == 1) {
                    screeningFormat = "REGULAR";
                    basePrice = 350;
                } else if (choice == 2) {
                    screeningFormat = "3D";
                    basePrice = 400;
                } else if (choice == 3) {
                    screeningFormat = "IMAX";
                    basePrice = 450;
                } else {
                    System.out.println("Invalid format.");
                    return;
                }

                if (hour >= 17 && hour <= 20) {
                    peakFee = 50;
                }

                double total = basePrice + peakFee;

                System.out.println();
                System.out.println("========================================");
                System.out.println("|            TICKET BREAKDOWN          |");
                System.out.println("========================================");
                System.out.println("|Screening Format: " + screeningFormat );
                System.out.printf("|Base Ticket Price: PHP %.2f%n", basePrice);
                System.out.printf("|Peak Hour Fee:     PHP %.2f%n", peakFee);
                System.out.println("========================================");
                System.out.printf("|TOTAL TICKET COST: PHP %.2f%n", total);
                System.out.println("|STATUS:             SEAT RESERVED");
                System.out.println("========================================");
            }
        }
