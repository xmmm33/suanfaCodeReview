public class Main {

    private static String lock1 = "111";

    private static String lock2 = "222";

    public static void main(String[] args) {
        System.out.println("初次提交");
        new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("111");
                }
            }
        }, "线程1").start();

        new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("222");
                }
            }
        },"线程2").start();
    }
}
