package com.company;

import java.util.Collection;

public interface IWaitList<E> {
    /**
     * Добавление элемента
     * @param element
     */
    public void add(E element);

    /**
     * Удаление первого элемента
     * @return первый элемент
     */
    public E remove();

    /**
     * Содержит ли элемент?
     * @param element
     * @return признак успеха
     */
    public boolean contains(E element);

    /**
     * Проверяет содержит ли все элементы из коллекции?
     * @param collection
     * @return признак успеха
     */
    public boolean containsAll(Collection<E> collection);

    /**
     * Проверяет, пустой ли список
     * @return признак успеха
     */
    public boolean isEmpty();
}
