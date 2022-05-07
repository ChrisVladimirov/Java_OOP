package Lab;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Field[] fields = Reflection.class.getDeclaredFields();

        Consumer<Method> print = method -> {
            if (method.getName().contains("set") && !Modifier.isPrivate(method.getModifiers())) {
                System.out.printf("%s have to be private!%n", method.getName());
            } else if (method.getName().contains("get") && !Modifier.isPublic(method.getModifiers())) {
                System.out.printf("%s have to be public!%n", method.getName());
            }
        };

        Arrays.stream(fields)
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> {
                    if (!Modifier.isPrivate(f.getModifiers())) {
                        System.out.printf("%s must be private!%n", f.getName());
                    }
                });

        Method[] methods = Reflection.class.getDeclaredMethods();

        Arrays.stream(methods)
                .filter(m -> m.getName().contains("set") || m.getName().contains("get"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(print);
    }
}