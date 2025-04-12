package org.example.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings({"All"})
public class Iterator_ {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new book(1,"a",1.1));
        col.add(new book(1,"b",1.1));
        col.add(new book(1,"c",1.1));
        col.add(new book(1,"d",1.1));
        System.out.println("col="+col);

        Iterator iterator = col.iterator();
        System.out.println("第一次遍历");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        while (iterator.hasNext()) {
            Object next = iterator.next();

        }
        //当迭代器推出while循环后，这是iterator，指向最后的元素
        //iterator.next();
        //如果需要再一次遍历，需要重置迭代器
        System.out.println("第二次遍历");
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //增强for，可以使用在集合，也可以用在数组上
        System.out.println("第三次遍历");
        col.forEach(System.out::println);
        System.out.println("第四次遍历");
        for (Object book : col) {
            System.out.println(book);
        }
    }
}
@SuppressWarnings({"all"})
class book{
    private int id;
    private String name;
    private double price;
    public book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "book [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
