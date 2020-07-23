package algo_datastruc.stack;

/**
 * @author $yed
 */
public class BaseStack<X> implements StackInterface {
    private X[] data;
    private int stackPointer; // track stack location

    BaseStack() {
        data = (X[]) new Object[100];
        stackPointer = 0;
    }

    @Override
    public void push(Object item) {
        data[stackPointer++] = (X) item;
    }

    @Override
    public Object pop() {
        while (stackPointer > 0) {
            for (int i = 0; i < stackPointer; i++) {
                return data[--stackPointer];
            }
        }
        throw new IllegalStateException( "Empty Stack" );
    }

    @Override
    public boolean contains(Object item) {
        boolean found = false;
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals( item )) {
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public Object search(Object item) {
        while (stackPointer > 0) {
            X tmpItem = (X) pop();
            if (item.equals( tmpItem )) {
                return tmpItem;
            }
        }
        return null;
    }

    public int size() {
        return stackPointer;
    }
}
