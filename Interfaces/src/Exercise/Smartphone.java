package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {
    List<String> numbers;
    List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new ArrayList<>();
        this.urls = new ArrayList<>();
    }

    @Override
    public String browse() {
        return null;
    }

    @Override
    public String call() {
        //return this.numbers.get(numbers.indexOf(number));
    return null;
    }
}
