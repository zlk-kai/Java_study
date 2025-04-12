package org.example.Iterator;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1.集合主要是两组（单列集合、双列集合）
        //2.collection接口有两个重要的子接口 List Set
        //3.Map接口的实现子类 是双列集合，存放K-V（Key-Value）

        //Collection
        //Map

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.forEach(System.out::println);
        System.out.println(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("a", "武安");
        hashMap.put("b", "复兴区");
        hashMap.put("c", "丛台区");
        System.out.println(hashMap);


    }
}
