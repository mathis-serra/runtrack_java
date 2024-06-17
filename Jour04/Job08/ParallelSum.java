
public class ParallelSum {
    public static void main(String[] args) {
        final long MAX_NUMBER = 10_000_000;
        final int NUM_THREADS = Runtime.getRuntime().availableProcessors();
        final long RANGE = MAX_NUMBER / NUM_THREADS;

        long[] results = new long[NUM_THREADS];
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < NUM_THREADS; i++) {
            long start = i * RANGE + 1;
            long end = (i == NUM_THREADS - 1) ? MAX_NUMBER : (i + 1) * RANGE;
            executor.submit(new SumTask(start, end, results, i));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long totalSum = 0;
        for (long sum : results) {
            totalSum += sum;
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}
