package com.company;

public class Main {

    public static void main(String[] args) {
        WaitList<Integer> waitList=new WaitList<>();
        BoundedWaitList<Integer> boundedWaitList= new BoundedWaitList<>(3);
        UnfairWaitList<Integer> unfairWaitList=new UnfairWaitList<>();

        System.out.println("Тестируем добавление элемента в WaitList");
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);
        waitList.add(4);
        System.out.println(waitList);
        System.out.println("Тестируем удаление первого элемента:");
        System.out.println("Элемент: "+waitList.remove()+" Wait List: "+waitList);
        System.out.println("Проверяем BoundedWaitList: ");
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        boundedWaitList.add(3);
        boundedWaitList.add(4);
        System.out.println(boundedWaitList);
        System.out.println("Проверяем UnfairWaitList: ");
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        unfairWaitList.add(4);
        System.out.println(unfairWaitList);
        System.out.println("Удаление: ");
        unfairWaitList.remove(2);
        System.out.println(unfairWaitList);
        System.out.println("Перемещение в конец: ");
        unfairWaitList.moveToBack(3);
        System.out.println(unfairWaitList);
    }
}
