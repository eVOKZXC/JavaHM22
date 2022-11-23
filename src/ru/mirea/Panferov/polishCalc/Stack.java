package ru.mirea.Panferov.polishCalc;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public int getCapacity(){
        return top + 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top+1 >= capacity;
    }

    public void push(int x){
        try{
            if (isFull()) throw new StackOverflow("Стэк переполнен, удалите элемент!");
            arr[++top] = x;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int pop(){
        int tempEl;
        try {
            if (isEmpty()) throw new StackEmpty("Стэк пуст, добавьте элемент!");
            tempEl = arr[top];
            arr[top--] = 0;
        }catch (Exception e){
            tempEl = 0;
            System.out.println(e.getMessage());
        }
        return tempEl;
    }

    public void printStack(){
        for (int i : arr){
            if (i != 0) System.out.print(i + " ");
        }
        System.out.println("");
    }
}
