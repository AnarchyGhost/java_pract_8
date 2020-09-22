package com.company;

public class BoundedWaitList<E> extends WaitList<E>{
    /**
     * Объем BoundedWaitList
     */
    private int capacity;

    /**
     * Конструктор
     * @param capacity
     */
    public BoundedWaitList(int capacity){
        super();
        this.capacity=capacity;
    }

    /**
     * getter
     * @return объём BoundedWaitList
     */
    public int getCapacity(){
        return this.capacity;
    }

    /**
     * Добавление элемента в BoundedWaitList
     * @param element
     */
    @Override
    public void add(E element) {
        if(concurrentLinkedQueue.size()<capacity) super.add(element);
        else System.out.println("Wait list is full");
    }

    /**
     * Перевод в стркоу
     * @return строковое представление списка
     */
    public String toString(){
       return "Capacity: "+this.getCapacity()+" "+super.toString();
    }
}
