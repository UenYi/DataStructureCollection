package com.uenyihung.datastructure.LinkedList;

/**
 * An object that will be used as a node for a LinkList. And object that
 * contains 3 values. The data value, the previous node address and the next
 * node address.
 *
 * @author Uen Yi Cindy Hung
 * @since 12/13/2016
 */
public class LinkedListNode<T> {

    private T data;
    private LinkedListNode<T> previous;
    private LinkedListNode<T> next;

    /**
     * Default constructor that calls the overloaded one.
     */
    public LinkedListNode(){
        this(null);
    }
    
    /**
     * One parameter constructor.
     */
    public LinkedListNode(T data) {
        super();
        this.data = data;
        previous = null;
        next = null;
    }

    /**
     * Sets the data value.
     *
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Sets the node that is previous to @this instance.
     *
     * @param node
     */
    public void setPrevious(LinkedListNode<T> node) {
        this.previous = node;
    }

    /**
     * Sets the node that is next to @this instance.
     *
     * @param node
     */
    public void setNext(LinkedListNode<T> node) {
        this.next = node;
    }

    /**
     * Retrieves the data value.
     *
     * @return T the data in the node.
     */
    public T getData() {
        return this.data;
    }

    /**
     * Retrieves the node that is previous to $this instance.
     *
     * @return LinkedListNode<T> the previous node.
     */
    public LinkedListNode<T> getPrevious() {
        return this.previous;
    }

    /**
     * Retrieves the node that is next to $this instance.
     *
     * @return LinkedListNode the next node.
     */
    public LinkedListNode<T> getNext() {
        return this.next;
    }

    /**
     * Returns the String representing the instance of LinkedListNode.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "LinkedListNode{\n"
                + "\tValue: " + data + "\n"
                + "\tPrevious: " + previous + "\n"
                + "\tNext: " + next + "\n"
                + "}";
    }
}
