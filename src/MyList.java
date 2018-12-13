import java.util.Arrays;

public class MyList<A> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newsize = element.length * 2;
        element = Arrays.copyOf(element, newsize);
    }

    public void add(A e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public A get(int i) {
        if (i >= size || i < 0) {
            System.out.println("Index: " + i + ", Size " + i);
        }
        return (A) element[i];
    }
}
