package Lab;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings extends ArrayList {
    private final List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        String remove = this.data.remove(this.data.size() - 1);
        return remove;
    }

    public String peek() {
        String e = this.data.get(this.data.size() - 1);
        return e;
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
