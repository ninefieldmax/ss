package testzhujie;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
public class Test3 {
    public static void main(String[] args) {
        for (int i = 0; i < Maparr.arr.size(); i++) {
            System.out.println(Maparr.arr.get(i).c + " " + Maparr.arr.get(i).name1 + " " + Maparr.arr.get(i).name2);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名著：");
        String s = scanner.next();
        boolean judge = false;
        for (int i = 0; i < Maparr.arr.size(); i++) {
            if (s.equals(Maparr.arr.get(i).c)) {
                System.out.println("名著存在，序列号为" + i);
                judge = true;
            }
            while (i == 2 & judge == false) {
                System.out.println("不存在该名著！");
                break;
            }
        }
        System.out.println("请输入名字");
        Scanner ad = new Scanner(System.in);
        String m = ad.next();
        judge=false;
        for (int i = 0; i < Maparr.arr.size(); i++) {
            if (Maparr.arr.get(i).name1.equals(m) || Maparr.arr.get(i).name2.equals(m)) {
                System.out.println("对应的名著为" + Maparr.arr.get(i).c);
                judge = true;
            }
                while (i == 2 & judge == false) {
                    System.out.println("无对应名著！");
                    break;
                }
            }

        }
    }
