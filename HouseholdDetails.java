import java.util.Scanner;

public class HouseholdDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int familyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (Y/N): ");
        char waterUsageStatus = sc.next().charAt(0);

        System.out.println("--- Household Details ---");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed in litres: " + waterConsumed);
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterUsageStatus);

        sc.close();
    }
}