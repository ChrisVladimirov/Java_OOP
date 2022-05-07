package Exercise.barracksWars;

import Exercise.barracksWars.interfaces.Repository;
import Exercise.barracksWars.interfaces.Runnable;
import Exercise.barracksWars.interfaces.UnitFactory;
import Exercise.barracksWars.core.Engine;
import Exercise.barracksWars.core.factories.UnitFactoryImpl;
import Exercise.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
