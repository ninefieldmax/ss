import java.util.*;
public class Outmoney {
    public static void main(String[] args) {
        ATM atm = new ATM();
        AS as = new AS();
        Runnable runable = new Runnable() {
            Scanner scanner = new Scanner(System.in);
            @Override
            public synchronized void run(){
                if (as.money > 200){
                    for (int i = 1;; i++) {
                        System.out.println("请选择业务1.ATM 2.柜台 3.退出");
                        String a = scanner.next();
                        String name = Thread.currentThread().getName();
                        if (a.equals("1")) {
                            as.money -= 100;
                            System.out.println(name + "您目前的账户余额为：" + as.money);
                            if(as.money<100){
                                System.out.println("账户余额不足！");
                                break;
                            }
                        } else if (a.equals("2")) {
                            as.money -= 200;
                            System.out.println(name + "您目前的账户余额为：" + as.money);
                            if(as.money<200){
                                System.out.println("账户余额不足！");
                                break;
                            }
                        } else if (a.equals("3")) {
                            System.out.println(name + "您目前的账户余额为：" + as.money);
                            System.out.println("结束取款！");
                            break;
                        }
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            }
            }
        };
        Counters counters = new Counters();
        Thread thread1 = new Thread(runable);
        thread1.start();
        Thread thread2 = new Thread(runable);
        thread2.start();
    }
}