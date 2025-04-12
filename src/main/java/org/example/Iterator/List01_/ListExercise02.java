package org.example.Iterator.List01_;

import java.util.*;

@SuppressWarnings({"all"})
public class ListExercise02{
    public static void main(String[] args) {
        List lists = new Vector();
        lists.add(new book("a","123",5.1));
        lists.add(new book("b","123",4.2));
        lists.add(new book("c","123",3.3));
        lists.add(new book("d","123",2.4));

        //遍历
        for (Object list : lists) {

            System.out.println(list.toString());
        }
        System.out.println("=============");
        sort(lists);
        for (Object list : lists) {
            System.out.println(list.toString());
        }
    }
    //静态方法
    //价格要求从小到大
    public static void  sort(List list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                //取出对象
                book book1 = (book) list.get(j);
                book book2 = (book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j+1, book1);
                }
            }
        }
    }
}