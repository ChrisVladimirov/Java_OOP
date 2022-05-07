package Exercises.TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] colors = reader.readLine().split("\\s+");
        int n = Integer.parseInt(reader.readLine());
        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String color : colors) {
            TrafficLight trafficLight = new TrafficLight(Colour.valueOf(color));
            trafficLights.add(trafficLight);
        }
        Consumer<TrafficLight> lightsTransitionAndPrint = trafficLight -> {
            trafficLight.changeColour();
            System.out.printf("%s ", trafficLight.getColour());
        };
        for (int i = 0; i < n; i++) {
            trafficLights.forEach(lightsTransitionAndPrint);
            System.out.println();
        }
    }
}