package ru.geekbrains.homeworks.lesson2;

public class MyLinkedList<E> implements List<E> {

    Node<E> head;
    int size;

    @Override
    public void add(E value) {
        Node<E> n = new Node<>(value);
        Node<E> last = head;
        n.next = null;

        if(head == null) {
            n.prev = null;
            head = n;
            size++;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = n;
        n.prev = last;
        size++;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E value) {

    }

    @Override
    public void remove(int index) { }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        Node<E> curr = head;
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList [");
        while (curr != null) {
            sb.append(curr.item);
            if (curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }

    class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item) {
            this.item = item;
        }
    }
}
