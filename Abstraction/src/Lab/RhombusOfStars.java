package Lab;

import java.util.Scanner;
import java.util.function.Predicate;

public class RhombusOfStars {
    private static class RombOfStars {
        private final int size;

        public RombOfStars(int size) {
            this.size = size;
        }

        public String buildString() {
            return printMultipleRows(1, size, +1) +
                    printMultipleRows(size - 1, 1, -1);
        }

        private String printMultipleRows(int start, int end, int step) {
            StringBuilder out = new StringBuilder();

            Predicate<Integer> loopCondition = iter -> {
                if (step > 0) {
                    return iter <= end;
                }
                return iter >= end;
            };

            for (int row = start; loopCondition.test(row); row += step) {
                out.append(printLine(size - row, row))
                        .append(System.lineSeparator());
            }

            return out.toString();
        }

        private String printLine(int spaces, int stars) {
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < spaces; i++) {
                out.append(" ");
            }

            for (int i = 0; i < stars; i++) {
                out.append("* ");
            }

            return out.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        RombOfStars rhombus = new RombOfStars(n);
        String result = rhombus.buildString();
        System.out.println(result);
    }
}