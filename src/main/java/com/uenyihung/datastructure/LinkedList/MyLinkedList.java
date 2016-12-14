package com.uenyihung.datastructure.LinkedList;

/**
 * A generic LinkedList.
 *
 * @author Uen Yi Cindy Hung
 * @since 12/13/2016
 */
public class MyLinkedList<T> {

    private int size;
    private LinkedListNode<T> first;
    private LinkedListNode<T> last;

    /**
     * Default constructor.
     */
    public MyLinkedList() {
        size = 0;
        first = null;
        last = null;
    }

    /**
     * Adds the element to the end of the list.
     *
     * @param element the element to add.
     */
    public void add(T element) {
        LinkedListNode<T> node = new LinkedListNode(element);

        if (first == null) {
            first = node;
        } else if (last == null) {
            last = node;
        } else {
            node.setPrevious(last.getPrevious());
            node.setNext(last);
            last.getPrevious().setNext(node);
            last.setPrevious(node);
        }

        size++;
    }

    /**
     * Inserts the element at the specified index.
     *
     * @param index
     * @param element
     */
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Cannot insert at index: " + index);
        }

        LinkedListNode<T> node = new LinkedListNode<>(element);

        LinkedListNode<T> prev = null;
        LinkedListNode<T> next = null;

        if (index == 0) {
            next = first;
            first = node;
        } else if (index == size - 1) {
            prev = last.getPrevious();
            next = last;
        } else {
            int position = 1;

            prev = first;
            while (position < index) {
                prev = prev.getNext();
                position++;
            }
            next = prev.getNext();
        }

        node.setPrevious(prev);
        node.setNext(next);
        
        if (prev != null) {
            prev.setNext(node);
        }
        
        next.setPrevious(node);

        size++;
    }

    /**
     * Retrieves the element stored at the index position.
     *
     * @param index the position in the list of the element.
     * @return T the element value
     */
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Cannot insert at index: " + index);
        }

        if (index == 0) {
            return first.getData();
        }

        if (index == size - 1) {
            return last.getData();
        }

        int position = 1;
        LinkedListNode<T> current = first.getNext();

        while (position < index) {
            current = current.getNext();
            position++;
        }

        return current.getData();
    }

    /**
     * Removes the element at the given index position.
     *
     * @return T the element value.
     */
    public T remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Cannot insert at index: " + index);
        }

        T data;

        if (index == 0) {
            data = first.getData();
            first.getNext().setPrevious(null);
            first = first.getNext();
        } else if (index == size - 1) {
            data = last.getData();
            last.getPrevious().setNext(null);
            last = last.getPrevious();
        } else {
            int position = 1;

            LinkedListNode<T> node = first.getNext();
            while (position < index) {
                node = node.getNext();
            }

            data = node.getData();
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
        }

        size--;
        return data;
    }

    /**
     * Retrieves the size of @this instance of LinkedList.
     *
     * @return
     */
    public int size() {
        return size;
    }
}
