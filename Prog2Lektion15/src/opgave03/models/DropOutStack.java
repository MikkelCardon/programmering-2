package opgave03.models;

import opgave01.models.StackEaaa;

import java.util.NoSuchElementException;

public class DropOutStack<E> implements StackEaaa<E> {
    private Node<E> head;
    private int maxSize;
    private int size = 0;

    public DropOutStack(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void push(E element) {
        if (isEmpty()){
            head = new Node<>(element);
            size++;
        }
        else if (maxSize != size){
            Node<E> newNode = new Node<>(element);
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            size++;
        }else{
            Node<E> currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.previous.next = null;

            Node<E> newNode = new Node<>(element);
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }


    @Override
    public E pop() {
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        if (head.next == null){
            E e = head.element;
            head = null;
            size--;
            return e;
        }
        E e = head.element;

        head.next.previous = null;
        head = head.next;
        size--;

        return e;
    }

    @Override
    public E peek() {
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return head.element;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node<T> {
        T element;
        Node<T> next;
        Node<T> previous;

        public Node(T element) {
            this.element = element;
        }
    }
}
