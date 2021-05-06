package testzhujie;

public class Test2 {
    public static void main(String[] args) {
        A26 a26=new A26();
        Thread t1=new Thread(a26,"线程1");
        Thread t2=new Thread(a26,"线程2");
        t1.start();
        t2.start();
    }
}
