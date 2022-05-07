package Lab;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<Object> {

    /**
     * @returns an element from the collection and removes it from the list
     */
    public Object getRandomElement() {
        int index = new Random().nextInt(super.size());
        return super.get(index);
    }
}