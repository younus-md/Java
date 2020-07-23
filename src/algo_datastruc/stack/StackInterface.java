package algo_datastruc.stack;

/**
 * @author $yed
 */
public interface StackInterface<X> {

    void push(X item);

    X pop();

    boolean contains(X item);

    X search(X item);


}
