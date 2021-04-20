package Arraylistp;

public class Costlist {
    public static void main(String[] args) {
        double max=Cost.arrayList.get(0).money;
        int i;
        int s=0;

        for(  i=0;i<Cost.arrayList.size()-1;i++){
            if(max>Cost.arrayList.get(i+1).money){
                max=max;
            }
            else{
                max=Cost.arrayList.get(i+1).money;
            }
        }
        for(i=0;i<Cost.arrayList.size();i++)
        if(max==Cost.arrayList.get(i).money){
            s=i;
        }
//        System.out.println(Cost.arrayList.size());
        System.out.println("消费记录里最高的名字是  "+Cost.arrayList.get(s).getName()+" 消费金额为："+max);
    }
}
