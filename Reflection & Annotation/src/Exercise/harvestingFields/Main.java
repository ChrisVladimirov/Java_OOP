package Exercise.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
    private enum Commands {
        PRIVATE, PUBLIC, PROTECTED, ALL
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class<?> clazz = RichSoilLand.class;
        List<Field> fieldList = Arrays.asList(clazz.getDeclaredFields());

        Map<Commands, List<Field>> fieldsMap = createMap(fieldList);

        fillTheFieldsMap(fieldList, fieldsMap);
        String input = scanner.nextLine();
        while (!input.equals("HARVEST")) {
            switch (input) {
                case "public":
                    fieldsMap.get(Commands.PUBLIC).forEach(Main::printer);
                    break;
                case "protected":
                    fieldsMap.get(Commands.PROTECTED).forEach(Main::printer);
                    break;
                case "private":
                    fieldsMap.get(Commands.PRIVATE).forEach(Main::printer);
                    break;
                case "all":
                    fieldsMap.get(Commands.ALL).forEach(Main::printer);
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void printer(Field f) {
        System.out.printf("%s %s %s%n", Modifier.toString(f.getModifiers()),
                f.getType().getSimpleName(), f.getName());
    }

    private static void fillTheFieldsMap(List<Field> fieldList, Map<Commands, List<Field>> fieldsMap) {
        for (Field field : fieldList) {
            String modifier = Modifier.toString(field.getModifiers());
            switch (modifier){
                case "public":
                    fieldsMap.get(Commands.PUBLIC).add(field);
                    break;
                case "private":
                    fieldsMap.get(Commands.PRIVATE).add(field);
                    break;
                case "protected":
                    fieldsMap.get(Commands.PROTECTED).add(field);
                    break;
            }
        }
    }

    private static Map<Commands, List<Field>> createMap(List<Field> fieldList) {
        Map<Commands, List<Field>> fieldsMap = new LinkedHashMap<>();
        fieldsMap.put(Commands.PUBLIC, new ArrayList<>());
        fieldsMap.put(Commands.PRIVATE, new ArrayList<>());
        fieldsMap.put(Commands.PROTECTED, new ArrayList<>());
        fieldsMap.put(Commands.ALL, fieldList);
        return fieldsMap;
    }
}
