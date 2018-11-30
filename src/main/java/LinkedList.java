import java.util.*;

public class Elements<E> {
    Elements element;
    Elements<E> next;
    Elements<E> previous;

    Elements(E element, Elements<E> next, Elements<E> previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }


    private E Remove(Elements<E> e) {
        E result = e.element;
        e.previous.next = e.next;
        e.next.previous = e.previous;
        e.next = e.previous = null;
        e.element = null;
        size--;
        return result;
    }


    private E Add(Elements<E> e) {
        E result = e.element;
        e.next.previous = e.element;
        e.element.next = e.next.previous;
        size++;
        return result;
    }

    void AddElemAtFirst(Elements<E> e) {
        E result = e.element;
        Add(e);
        return result;
    }

    void AddElemAtLast(Elements<E> e) {
        E result = e.element;
        int i;
        while (i < size) {
            i++;
        }
        Add(e);
        return result;
    }

    public int size() {
        return size;
    }

}

