import java.util.Scanner;
public class WaterBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        int consumption = sc.nextInt();

        

        if (consumption <= 500) {
           System.out.println("bill = 100");
        } else {
            System.out.println("bill = 200");
        }

        

        sc.close();
    }
}