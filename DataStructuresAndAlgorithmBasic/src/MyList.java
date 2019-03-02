import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public void add(int index, E element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == size) {
            ensureCapacity(size+1);
        }
        if (index != size) {
            System.arraycopy(elements, index, elements, index + 1, size - index);
        }
        elements[index] =  element;
        size++;
    }

    public E remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E r = (E) elements[index];
        if (index != --size) {
            System.arraycopy(elements, index + 1, elements, index, size - index);
        }
        elements[index] = null;
        return r;
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyList<?> myList = new MyList<>();
        myList.elements = Arrays.copyOf(elements, size);
        return (E) myList;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int current = elements.length;
        if (minCapacity > current) {
            Object[] newElements = new Object[Math.max(current*2, minCapacity)];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public E get(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public void clear() {
        if (size > 0) {
            Arrays.fill(elements, 0, size, null);
            size = 0;
        }
    }
}
