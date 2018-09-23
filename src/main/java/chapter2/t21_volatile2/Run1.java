package chapter2.t21_volatile2;

public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();

        System.out.println("我要停止它！stopThread="
                + Thread.currentThread().getName());
        Thread.sleep(4000);
        printStringService.setContinuePrint(false);
        System.out.println("停止");
    }

}
