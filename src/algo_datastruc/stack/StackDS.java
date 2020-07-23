package algo_datastruc.stack;

/**
 * @author $yed
 */
/*
    Abstract Data Type focus on feature
    Push(add) ---- O(1)
 *  Pop(take out ele) --- O(1)
 *  Search / find /peek -- O(n)
 *  Follows LIFO
 *
 *
 *  */
public class StackDS<X> { // represent a generic class to store any kind of data
    private X[] data;
    private int stackPointer; // track stack location

    public StackDS() {
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    public void push(X newItem) {
        data[stackPointer++] = newItem;

    }

    public X pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException( "No items in stack" );
        }
        return data[--stackPointer]; // not deleting data
    }

    public boolean contains(X item) {
        boolean found = false;
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals( item )) {
                found = true;
                break;
            }
        }
        return found;
    }

    public X searchElement(X item) {
        while (stackPointer > 0) {
            X tmpItem = pop();
            if (item.equals( tmpItem )) {
                return tmpItem;
            }
        }
        throw new IllegalStateException( "No such elemenst" );
    }

    public int size() {
        return stackPointer;
    }
}
