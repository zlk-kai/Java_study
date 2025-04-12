package org.example.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@SuppressWarnings({"all"})
public class Collection_Method {
    public static void main(String[] args) {
        List list = new ArrayList();
        //add:添加单个元素
        list.add("a");
        list.add("b");
        list.add(true);
        list.add(true);
        System.out.println("List: " + list);
        //remove:删除指定元素
        list.remove(true);
        System.out.println("List: " + list);
        //contains:查找元素是否存在
        System.out.println(list.contains("a"));//F\ture
        //size:获取元素个数
        System.out.println(list.size());
        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());
        //clear:清空集合
        //list.clear();
        //System.out.println(list.isEmpty());
        //addAll:添加多个集合
        List list1 = new ArrayList();
        list1.addAll(list);
        System.out.println("List: " + list1);
        //containsAll:判断多个元素是否存在
        System.out.println(list1.containsAll(list));
        //removeAll:删除多个元素
        list1.removeAll(list1);
        System.out.println("删除多个元素List: " + list1);

        //遍历方法：Iterable
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
