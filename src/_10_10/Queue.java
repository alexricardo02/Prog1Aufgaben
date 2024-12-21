package _10_10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Queue {
    public int[] elements = new int[8];
    public int size = 0;

    public Queue() {
    }

    public void enqueue(int v) {
        if (elements.length == size ) {
            resize();
        }
        elements[size] = v;
        size++;
    }

    private void resize() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }


    public int dequeue() {

        if(empty()) {
            throw new RuntimeException("Queue is empty");
        }

        int removedElement = elements[0];

        for (int i = 0; i <= size; i++){
            elements[i] = elements[i+1];
        }
        size --;
        return removedElement;


    }

    public boolean empty(){
        return elements.isEmpty();
    }

    public int getSize() {
        return this.size;
    }

}
