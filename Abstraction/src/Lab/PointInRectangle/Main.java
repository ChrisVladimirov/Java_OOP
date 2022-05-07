package Lab.PointInRectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] coordinates = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Rectangle rectangle = new Rectangle();
        rectangle.setBottomLeft(new Point(coordinates[0], coordinates[1]));
        rectangle.setTopRight(new Point(coordinates[2], coordinates[3]));

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            int[] pointCoordinates = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Point currentPoint = new Point(pointCoordinates[0], pointCoordinates[1]);
            if (rectangle.contains(currentPoint)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
