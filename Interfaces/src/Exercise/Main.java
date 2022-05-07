package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> urls = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numbers, urls);
        for (String number : numbers) {
            Matcher matcher = Pattern.compile("\\d+").matcher(number);
            if (matcher.matches()) {
                System.out.printf("Calling... %s%n", number);
            } else {
                System.out.println("Invalid number!");
            }
        }

        for (String url : urls) {
            Matcher matcher = Pattern.compile("[/.A-Za-z:]+").matcher(url);
            if (matcher.matches()) {
                System.out.printf("Browsing... %s!%n", url);
            } else {
                System.out.println("Invalid URL!");
            }
        }
    }
}

//към трета задача:
/* Map<String, Buyer> buyersByNames = new HashMap<>();

        int N = Integer.parseInt(scanner.nextLine());
        while (N-- > 0) {
            Buyer buyer = createBuyer(scanner.nextLine());
            buyersByNames.put(buyer.getName(), buyer);
        }
        String line = scanner.nextLine();

        while (!line.equals("End")) {
            Buyer buyer = buyersByNames.get(line);

            if (buyer != null) {
                buyer.buyFood();
            }

            line = scanner.nextLine();
        }

        System.out.println(buyersByNames.values().stream().mapToInt(Buyer::getFood).sum());
    }
*/
//към четвърта задача:
/*private static Buyer createBuyer(String line) {
        String[] tokens = line.split("\\s+");
        if (tokens.length == 4) {
            return new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
        }
        return new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
    }*/