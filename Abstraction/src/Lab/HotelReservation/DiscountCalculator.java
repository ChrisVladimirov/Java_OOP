package Lab.HotelReservation;

import java.util.function.BiFunction;
import java.util.function.Function;

public class DiscountCalculator {
    enum Season {
        Spring(2), Summer(4), Autumn(1), Winter(3);
        private final int multiplier;

        Season(int multiplier) {
            this.multiplier = multiplier;
        }

        public int getMultiplier() {
            return multiplier;
        }
    }

    enum Discount {
        VIP(20), SecondVisit(10), None(0);
        private final int percentage;

        Discount(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }

    public double calculatePrice(double pricePerDay, int numberOfDays, Season season, Discount discount) {
        double reduction = calcReduction.apply(discount);
        int[] arr = new int[2];
        arr[0] = numberOfDays;
        arr[1] = season.getMultiplier();

        double price = initialPrice.apply(arr, pricePerDay);
        double reduced = getReduction.apply(price, reduction);
        return price - reduced;
    }

    private final Function<Discount, Double> calcReduction = discount -> discount.getPercentage() / 100.0;

    private final BiFunction<Double, Double, Double> getReduction = (price, reduction) -> price * reduction;

    private final BiFunction<int[], Double, Double> initialPrice = (arr, perDay) -> {
        int days = arr[0];
        int multiplier = arr[1];

        return days * perDay * multiplier;
    };
}