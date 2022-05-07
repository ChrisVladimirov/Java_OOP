package Exercise.barracksWars.core.factories;

import Exercise.barracksWars.interfaces.Unit;
import Exercise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "Exercise.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) /*throws ExecutionControl.NotImplementedException*/ {
        // TODO: implement for problem 3
		/*switch (unitType){
			case "Archer":
				return new Archer();
			case "Pikeman":
				return new Pikeman();
			case "Swordsman":
				return new Swordsman();
			case "Horseman":
				return new Horseman();
			case "Gunner":
				return new Gunner();
		}
		throw new ExecutionControl.NotImplementedException("message");*/
        try {
            Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<Unit> constructor = unitClass.getConstructor();
            return constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
