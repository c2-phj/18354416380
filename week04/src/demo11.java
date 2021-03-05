

   class PrintNum implements Runnable {
    //是否现在先运行
    private boolean runNow;
    private Object lock;
    private int num;

    public PrintNum(boolean runNow, Object lock, int num) {
        this.runNow = runNow;
        this.lock = lock;
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (num <= 10) {
                if (runNow) {
                    //第一次进来可以直接运行，但是循环第二次之后需要先等到唤醒才能运行
                    runNow = false;
                } else {
                    //先等待
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(num);
                num += 2;

                //通知其他线程运行
                lock.notify();
            }
        }
    }


    public static class demo11 {
        public static void main(String[] args) {
            Object lock = new Object();
            Thread t1 = new Thread(new PrintNum(true, lock, 1));
            Thread t2 = new Thread(new PrintNum(false, lock, 2));
            //t2先运行，先进入等待状态
            t2.start();
            //t1直接运行，唤醒t2之后进入等待
            t1.start();
        }
    }
}

