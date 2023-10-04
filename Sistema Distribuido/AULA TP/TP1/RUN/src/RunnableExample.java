// 创建一个类，实现 Runnable 接口
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 这里定义线程要执行的任务
        for (int i = 0; i < 5; i++) {
            System.out.println("线程正在执行，i = " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // 创建一个 MyRunnable 实例
        MyRunnable myRunnable = new MyRunnable();

        // 创建一个线程，并将 MyRunnable 实例传递给它
        Thread thread = new Thread(myRunnable);

        // 启动线程
        thread.start();

        // 主线程继续执行其他任务
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程正在执行，i = " + i);
        }
    }
}
