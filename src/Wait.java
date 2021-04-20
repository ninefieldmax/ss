/*

    public class Wait {
        public static Object obj = new Object();
        public static void main(String[] args) {
            // 演示waiting 等待线程
            Runnable runnable1 = new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        synchronized (obj) {
                            try {
                                System.out.println(Thread.currentThread().getName() +
                                        "=== 我在循环处理，获取到锁对象，我要进入wait，释放锁对象");
                                obj.wait(); //无限等待 守株待兔
                                //obj.wait(5000); //计时等待, 5秒 时间到，自动醒来
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(Thread.currentThread().getName(
                            )
                                    "=== 我从waiting状态被醒来，获取到锁对象，继续执行了");
                        }
                    }
                }
            };
            new Thread(runnable1,"等待线程").start();
            //唤醒线程
            Runnable runnable2 =  new Runnable() {
                @Override
                public void run() {
                    // while (true){ //每隔3秒 唤醒一次
                    try {
                        System.out.println(Thread.currentThread().getName() +
                                "‐‐‐‐‐ 我要 sleep 10秒了....");
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() +
                                "‐‐‐‐‐ 我获取到锁对象,我要调用notify方法，释放锁对象，通知唤醒另外线程");
                        obj.notify();
                    }
                }
            };
            new Thread(runnable2,"唤醒线程").start();
        }
    }
*/
