package testzhujie;

import java.util.ArrayList;
import java.util.HashMap;

public class Maparr {
    public String name1;
    public String name2;
    public String c;

     static ArrayList<Maparr> arr=new ArrayList<>();
    static{
        Maparr a1=new Maparr();
        Maparr a2=new Maparr();
        Maparr a3=new Maparr();
        a1.c="三国演义";
        a1.name1="刘备";
        a1.name2="曹操";
        a2.c="射雕英雄传";
        a2.name1="郭靖";
        a2.name2="黄蓉";
        a3.c="倚天屠龙记";
        a3.name1="张无忌";
        a3.name2="赵敏";
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
    }
}
