package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
    /**
     * Конструктор по умолчанию
     */
    public UnfairWaitList(){
        super();
    }

    /**
     * Удаление первого вхождения элемента
     * @param element
     */
    public void remove(E element){
        boolean f=false;
        E el;
        ConcurrentLinkedQueue<E> eConcurrentLinkedQueue=new ConcurrentLinkedQueue<E>();
        while(concurrentLinkedQueue.size()>0){
            el=concurrentLinkedQueue.remove();
            if(el==element&&!f){
                f=true;
                continue;
            }else {
                eConcurrentLinkedQueue.add(el);
            }
        }
        concurrentLinkedQueue=eConcurrentLinkedQueue;
    }

    /**
     * Перемещение первого вхождения элемента в конец
     * @param element
     */
    public void moveToBack(E element){
        boolean f=false;
        E el,tmp = null;
        ConcurrentLinkedQueue<E> eConcurrentLinkedQueue=new ConcurrentLinkedQueue<E>();
        while(concurrentLinkedQueue.size()>0){
            el=concurrentLinkedQueue.remove();
            if(el==element&&!f){
                f=true;
                tmp=el;
            }else {
                eConcurrentLinkedQueue.add(el);
            }
        }
        if(tmp!=null)eConcurrentLinkedQueue.add(tmp);
        concurrentLinkedQueue=eConcurrentLinkedQueue;
    }
}
