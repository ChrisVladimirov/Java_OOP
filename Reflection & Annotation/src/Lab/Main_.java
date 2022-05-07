package Lab;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Main_ {
    public static void main(String[] args) {
        Method[] methods = Reflection.class.getDeclaredMethods();
        Method[] getters = Arrays.stream(methods)
                .filter(m -> m.getName().startsWith("get") &&
                        m.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        Method[] setters = Arrays.stream(methods)
                .filter(m -> m.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        Consumer<Method> print = method -> {
            if (method.getName().contains("set")) {
                System.out.printf("%s and will set field of %s%n", method.getName(),
                        formatType(method.getParameterTypes()[0]));
            } else {
                System.out.printf("%s will return %s%n", method.getName(),
                        formatType(method.getReturnType()));
            }
        };
        Arrays.stream(getters).forEach(print);
        Arrays.stream(setters).forEach(print);
    }

    public static String formatType(Class<?> type) {
        return type == int.class ? "class " + type : type.toString();
    }
}