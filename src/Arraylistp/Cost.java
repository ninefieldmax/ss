package Arraylistp;

import java.util.ArrayList;

public class Cost {
    String name;
    double money;
   static ArrayList<Cost> arrayList=new ArrayList<>(1000);
    static{
        Cost c1=new Cost();
        c1.name="小芳";
        c1.money=1669;
        Cost c2=new Cost();
        c2.name="小汪";
        c2.money=200;
        Cost c8=new Cost();
        c8.name="小汪";
        c8.money=200;
        Cost c3=new Cost();
        c3.name="马鱼";
        c3.money=999.0;
        Cost c4=new Cost();
        c4.name="伍佰原";
        c4.money=500;
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        arrayList.add(c4);
        Cost c5=new Cost();
        c5.name="李蝶";
        c5.money=1234;
        arrayList.add(c5);
        arrayList.add(c8);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
}
