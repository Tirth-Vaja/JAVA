class SumTask implements Runnable {
    private int start, end;
    private long[] sumArray;
    private int index;

    public SumTask(int start, int end, long[] sumArray, int index) {
        this.start = start;
        this.end = end;
        this.sumArray = sumArray;
        this.index = index;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        sumArray[index] = sum; 
    }
}

public class ParallelSum {
    public static void main(String[] args) {
       
        int N = 100;
        int numThreads = 4; 

        long[] sumArray = new long[numThreads];

        Thread[] threads = new Thread[numThreads];

        int chunkSize = N / numThreads;
        int remainder = N % numThreads;

        int start = 1;
        for (int i = 0; i < numThreads; i++) {
            int end = start + chunkSize - 1;
            if (i < remainder) {
                end++; 
            }

            threads[i] = new Thread(new SumTask(start, end, sumArray, i));
            threads[i].start();

            start = end + 1;
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            totalSum += sumArray[i];
        }

        System.out.println("Sum of numbers from 1 to " + N + " is: " + totalSum);
    }
}
