package com.luizhf42.datastructures;

import java.util.NoSuchElementException;

public class Stack<T> {
    private final T[] stack;
    private int top;

    public Stack(int size) {
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T element) throws IllegalStateException {
        if (isFull()) throw new IllegalStateException("Stack is full!");
        else {
            this.stack[++this.top] = element;
            System.out.println("Pushed to the stack:" + element);
        }
    }

    public T pop() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty!");

        final T poppedElement = this.stack[this.top];
        this.stack[this.top] = null;
        this.top--;
        return poppedElement;
    }

    public boolean isEmpty() {
        return this.top < 0;
    }

    public boolean isFull() {
        return this.top >= this.stack.length - 1;
    }

    public T peek() {
        return stack[top];
    }

    public int getSize() {
        return stack.length;
    }
}
