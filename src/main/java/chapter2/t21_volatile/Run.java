package chapter2.t21_volatile;

public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！stopThread="
                + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }

}