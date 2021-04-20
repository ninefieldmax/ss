package Arraylist;

import java.util.ArrayList;

public class Arrayt {
    public static void main(String[] args) {
        Dogs dog;
        System.out.println("有"+Dogs. linkedList.size()+"种宠物狗的信息");
        for(int i=0;i<Dogs. linkedList.size();i++){
        dog=Dogs. linkedList.get(i);
            System.out.println(dog.getName()+"  "+dog.getKind());
    }
        Dogs dog1=Dogs. linkedList.get(0);
        Dogs dog2=Dogs. linkedList.get(1);
        Dogs dog3=Dogs. linkedList.get(2);
        Dogs dog4=new Dogs();
        dog4.name="大美";
        dog4.kind="安纳托利亚牧羊犬";
        Dogs. linkedList.removeFirst();
        Dogs.linkedList.addLast(dog4);
        System.out.println("改动之后的狗信息：");
        for(int i=0;i<Dogs. linkedList.size();i++){
            dog=Dogs. linkedList.get(i);
            System.out.println(dog.getName()+"  "+dog.getKind());
        }
        System.out.println("最后一条狗的名字是"+Dogs.linkedList.getLast().getName());
        System.out.println("共"+Dogs.linkedList.size()+"条狗信息");
        /*if(Dogs. linkedList.contains(dog2)){
            System.out.println("该狗存在列表内！");
        }
        else{
            System.out.println("不存在该狗！");
        }*/
    }
}
