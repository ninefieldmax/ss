package testzhujie;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A26 extends Thread{
    public  void   run(){
        Lock lock= new ReentrantLock();
            String a = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
            char b[] = new char[26];
            a.getChars(0, 26, b, 0);
            A26 s=new A26();
         for (int i = 0; i < 26; i++) {
             lock.lock();
                System.out.println(b[i] + " "+currentThread().getName());
             lock.unlock();
            }
}
}
