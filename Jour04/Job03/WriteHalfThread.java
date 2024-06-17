import java.io.FileWriter;
import java.io.IOException;

public class WriteHalfThread extends Thread {
    private String data;
    private int start;
    private int end;
    private FileWriter writer;

    public WriteHalfThread(String data, int start, int end, FileWriter writer) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.writer = writer;
    }

    @Override
    public void run() {
        try {
            synchronized (writer) {
                writer.write(data.substring(start, end));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
