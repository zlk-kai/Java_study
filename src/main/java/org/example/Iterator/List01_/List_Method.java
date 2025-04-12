package org.example.Iterator.List01_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class List_Method {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("all");
        arrayList.add("bll");
        //在index位置插入元素
        arrayList.add(1,"zhangsan");
        System.out.println(arrayList);
        //boolean addAll:从index位置开始将eles中的所有算添加进来
        arrayList.addAll(1, arrayList);
        System.out.println(arrayList);
        //object get():获取指定index位置的元素
        arrayList.get(1);
        //int indexof(Object ogj):返回obj在集合中首次出现的位置
        arrayList.add("张林凯");
        int a = arrayList.indexOf("张林凯");
        System.out.println(a);
        //Objcet remove(int index):移除指定index位置的元素，并返回此元素
        System.out.println(arrayList.remove(a));
        //Pbject set(int index,Objcet ele):设置指定index位置的元素为ele,相当于是替换。
        arrayList.set(arrayList.size()-1, "arrayList.remove(a)");
        System.out.println(arrayList);
        //List subList(int fromIndex,int toIndex):返回从fromIndex到Toindex位置的子集合
        System.out.println(arrayList.subList(1, arrayList.size()-2));
    }
}