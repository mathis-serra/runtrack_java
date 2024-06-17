import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SumTask implements Runnable {
    private long start;
    private long end;
    private long[] result;
    private int index;

    public SumTask(long start, long end, long[] result, int index) {
        this.start = start;
        this.end = end;
        this.result = result;
        this.index = index;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        result[index] = sum;
    }
}
