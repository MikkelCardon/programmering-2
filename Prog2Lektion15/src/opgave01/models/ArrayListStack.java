package opgave01.models;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack<E> implements StackEaaa<E>{
    ArrayList<E> arrayList = new ArrayList();


    @Override
    public void push(E element) {
        arrayList.addFirst(element);
    }

    @Override
    public E pop() {
        throwIfEmpty();
        return arrayList.removeFirst();
    }

    @Override
    public E peek() {
        throwIfEmpty();
        return arrayList.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public void clear() {
        arrayList.clear();
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    private void throwIfEmpty() {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
    }
}
