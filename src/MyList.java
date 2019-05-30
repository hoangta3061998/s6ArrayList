public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPICITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPICITY];
    }

    public MyList(int capicity) {
        elements = new Object[capicity];
    }

    public void add(int index, E element) {
        for (int i = index; i < elements.length; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
    }

    public E remove(int index) {
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        return (E) elements[index];
    }

    public int size() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                size++;
            }
        }
        return size;
    }

    public E clone() {
        E clone;
        clone = (E) elements;
        return clone;
    }

    public boolean contains(E o) {
        boolean isContain = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                isContain = true;
            }
        }
        return isContain;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                index = i;
            }
        }
        return index;
    }

    public boolean add(E e) {
        if (size < elements.length) {
            elements[elements.length - 1] = e;
            return true;
        } else {
            return false;
        }
    }

    public void ensureCapicity(int minCapicity) {
        Object[] tempList = new Object[minCapicity];
        for (int i = 0; i < elements.length; i++) {
            tempList[i] = elements[i];
        }
        elements = tempList;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
