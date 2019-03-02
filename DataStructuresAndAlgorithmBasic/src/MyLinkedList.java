import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {}

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", NumNodes: " + numNodes);
        }
        if (index == 0) {
            addFirst(element);
        } else if (index == numNodes) {
            addLast(element);
        } else {
            Node node = new Node(element);
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            numNodes++;
        }
    }

    public void addFirst(E element) {
        Node node = new Node(element);
        if (numNodes == 0) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        numNodes++;
    }

    public void addLast(E element) {
        Node node = new Node(element);
        if (numNodes == 0) {
            head = node;
        } else {
            head.next = node;
        }
        numNodes++;
    }

    public E remove(int index) {
        numNodes--;
        if (numNodes == 0) {
            E r = (E) head.getData();
            head = null;
            return r;
        } else {
            Node temp = head;
            E r;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            r = (E) temp.next.getData();
            Node tempo = temp.next.next;
            temp.next.next = null;
            temp.next = tempo;
            return r;
        }
    }

    public boolean remove(Object e) {
        Node currentNode = head;
        int currentPosition = 0;
        while (currentNode != null) {
            if (currentNode.getData().equals(e)) {
                break;
            }
            currentNode = currentNode.next;
            currentPosition++;
        }
        if (currentNode == null) {
            return false;
        } else {
            numNodes--;
            if (numNodes == 0) {
                head = null;
            } else {
                currentNode = head;
                for (int i = 0; i < currentPosition - 1; i++) {
                    currentNode = currentNode.next;
                }
                Node temp = currentNode.next;
                currentNode.next = currentNode.next.next;
                temp.next = null;
            }
            return true;
        }
    }

    public int size() {
        return numNodes;
    }

    public E clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        for (Node currentNode = head; currentNode != null; currentNode = currentNode.next) {
            clone.add((E) currentNode.getData());
        }
        return (E) clone;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        int index = 0;
        if (o == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (o.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E get(int i) {
        if (i < 0 && i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i + ", NumNodes: " + numNodes);
        }
        Node currentNode = head;
        for (int j = 0; j < i; j++) {
            currentNode = currentNode.next;
        }
        return (E) currentNode.getData();
    }

    public E getFirst() {
        Node first = head;
        if (first == null) {
            throw new NoSuchElementException();
        }
        return (E) first.getData();
    }

    public E getLast() {
        Node last = head;
        for (int i = 1; i < numNodes; i++) {
            last = last.next;
        }
        if (last == null) {
            throw new NoSuchElementException();
        }
        return (E) last.getData();
    }

    public void clear() {
        for (Node x = head; x != null; ) {
            Node next = x.next;
            x.data = null;
            x.next = null;
            x = next;
        }
        head = null;
        numNodes = 0;
    }

    private static class Node {
        Node next;
        Object data;

        Node(Object data) {
            this.data = data;
        }

        Object getData() {
            return data;
        }
    }
}