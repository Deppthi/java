import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        double costPerLiter = 103.0; 
        double money = 100.0;        

        double liters = calculateLiters(money, costPerLiter);

        System.out.printf("With %.2f rupees, you can get %.4f liters of petrol.%n", money, liters);
    }

    public static double calculateLiters(double money, double costPerLiter) {
        return money / costPerLiter;
    }
}