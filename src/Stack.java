
import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public void push(Integer item) {
        items.add(item);
    }

    public Integer pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        }
        return null;
    }

    public Integer peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        }
        return null;
    }

    private boolean isEmpty() {
        return items.isEmpty();
    }

}
