package org.example.Iterator.List01_;

import java.sql.Array;
import java.util.ArrayList;

@SuppressWarnings({"all"})
public class List_ {
    public static void main(String[] args) {
        //List集合类中元素有序（添加顺序和取出顺序一致）、且可重复
        ArrayList arrayList = new ArrayList();
        arrayList.add("all");
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList.get(0));
    }
}
