package org.example.Iterator.List01_;

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node laohan = new Node("laohan");

        jack.next = tom;
        tom.next = laohan;

        laohan.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = laohan;

        //输出first信息
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }

        //输出first信息
        while (last != null) {
            System.out.println(last);
            last = last.pre;
        }
    }
}

class Node{
    public Object item;//真正存放数据的地方
    public Node next;//指向下一个节点
    public Node pre;//指向上一个节点
    public Node(Object item){
        this.item = item;
    }
    public String toString() {
        return "Node name = " +item;
    }
}
