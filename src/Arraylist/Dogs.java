package Arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Dogs {
    public String name;
    public String kind;
   static LinkedList<Dogs> linkedList=new LinkedList<Dogs>();
    static{
        Dogs dog1=new Dogs();
        dog1.name="小哈";
        dog1.kind="哈士奇";
        Dogs dog2=new Dogs();
        dog2.name="小白";
        dog2.kind="金毛";
        Dogs dog3=new Dogs();
        dog3.name="小飞";
        dog3.kind="田园犬";
        linkedList.add(dog1);
        linkedList.add(dog2);
        linkedList.add(dog3);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
