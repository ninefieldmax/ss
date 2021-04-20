package itera;

import java.util.HashSet;
import java.util.Set;

public class Dog {
    String name;
    String kind;
     static Set<Dog> set=new HashSet<Dog>();
    static{
        Dog dog1=new Dog();
        dog1.name="笑小";
        dog1.kind="小吉吉";
        Dog dog2=new Dog();
        dog2.name="晓眉";
        dog2.kind="牧羊犬";
        Dog dog3=new Dog();
        dog3.name="萨嗄";
        dog3.kind="卡宾犬";
        Dog dog4=new Dog();
        dog4.name="酷狗";
        dog4.kind="巨犬";
        set.add(dog1);
        set.add(dog2);
        set.add(dog3);
        set.add(dog4);
    }
}
