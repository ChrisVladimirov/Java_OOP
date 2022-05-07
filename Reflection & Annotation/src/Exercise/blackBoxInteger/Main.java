package Exercise.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Constructor<BlackBoxInt> ctr = clazz.getDeclaredConstructor();
        ctr.setAccessible(true);
        BlackBoxInt blackBoxInt = ctr.newInstance();

        List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());
        Scanner scanner = new Scanner(System.in);

        Field innerValue = clazz.getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String command_name = command.split("_")[0];
            int command_value = Integer.parseInt(command.split("_")[1]);

            Method currentBlackBoxIntMethod = getMethod(methods, command_name);
            assert currentBlackBoxIntMethod != null;
            currentBlackBoxIntMethod.setAccessible(true);
            currentBlackBoxIntMethod.invoke(blackBoxInt, command_value);

            System.out.println(innerValue.get(blackBoxInt));
            command = scanner.nextLine();
        }
    }

    private static Method getMethod(List<Method> methods, String input) {
        for (Method method : methods) {
            if (method.getName().equals(input)) {
                return method;
            }
        }
        return null;
    }
}
