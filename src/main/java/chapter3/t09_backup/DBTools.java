package chapter3.t09_backup;

public class DBTools {

    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA == true) {
                wait();
            }
            /**
             * 这个就是模拟备份过程
             */
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (prevIsA == false) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
