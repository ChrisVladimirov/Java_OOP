package Lab.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DiscountCalculator calculator = new DiscountCalculator();
        String[] tokens = scanner.nextLine().split("\\s+");
        double price = calculator.calculatePrice(Double.parseDouble(tokens[0]), Integer.parseInt(tokens[1]), DiscountCalculator.Season.valueOf(tokens[2]), DiscountCalculator.Discount.valueOf(tokens[3]));
        System.out.printf("%.2f",price);
    }
}