package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-08 08:41
 * @description
 **/

public class TestLinkedList {

    private Node first;
    private Node last;
    private int size;

    //[]
    //[a b c ]
    public void add(Object o) {
        Node node = new Node(o);
        if(first == null) {
            first = node;
            last = node;
        }else {
            node.previous = last;
            node.next = null;
            last.next = node;
            last = node;
        }
        size++;
    }

    public static void main(String[] args) {

        TestLinkedList linkedList = new TestLinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList);
    }


    public String toString()
    {
        Node temp = first;
        StringBuilder stringBuilder = new StringBuilder("[");
        while (temp!=null)
        {
            stringBuilder.append(temp.element+",");
//            System.out.println(temp.element);
            temp = temp.next;
        }
        stringBuilder.setCharAt(stringBuilder.length()-1, ']');
        return String.valueOf(stringBuilder);
    }

}
