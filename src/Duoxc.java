import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Duoxc extends Thread{

    public static void main(String[] args) {
        Runnable runable=new Runnable(){
            Thread name=Thread.currentThread();
            public void run(){
                System.out.println("当前线程"+name);
            }
        };
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(runable);
        executorService.shutdown();
    }
}
