package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {

    ConcurrentLinkedQueue<E> concurrentLinkedQueue;

    /**
     * Конструктор копирования
     * @param collection
     */
    public WaitList(Collection<E> collection){
        concurrentLinkedQueue=new ConcurrentLinkedQueue<>(collection);
    }

    /**
     * Конструктор по умолчанию
     */
    public WaitList(){
        concurrentLinkedQueue=new ConcurrentLinkedQueue<>();
    }

    /**
     * Добавляет элемент
     * @param element
     */
    @Override
    public void add(E element) {
        concurrentLinkedQueue.add(element);
    }

    /**
     * Удаляет первый элемент в очереди
     * @return первый элемент
     */
    @Override
    public E remove() {
        if(concurrentLinkedQueue.isEmpty())return null;
        else return concurrentLinkedQueue.remove();
    }

    /**
     * Содержится ли элемент в списке?
     * @param element
     * @return признак успеха
     */
    @Override
    public boolean contains(E element) {
        return concurrentLinkedQueue.contains(element);
    }

    /**
     * Содержатся ли все элементы из коллекции в списке
     * @param collection
     * @return признак успеха
     */
    @Override
    public boolean containsAll(Collection<E> collection) {
        return concurrentLinkedQueue.containsAll(collection);
    }

    /**
     * Проверка на наличие элементов в списке
     * @return признак успеха
     */
    @Override
    public boolean isEmpty() {
        return concurrentLinkedQueue.isEmpty();
    }

    /**
     * Перевод списка в строку
     * @return строковое представление списка
     */
    public String toString(){
        return concurrentLinkedQueue.toString();
    }
}
