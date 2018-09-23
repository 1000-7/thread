package chapter1.t04_threadsafe;

public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
