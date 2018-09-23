package chapter3.t08_pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

    public static void main(String[] args) {

        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

            // inputStream.connect(outputStream);
            outputStream.connect(inputStream);//管道流的连接
            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();
            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();

            Thread.sleep(2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
