package parallel;

import java.util.concurrent.*;

import static util.MyLogger.log;

public class ParallelMain3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // thread 풀을 준비한다
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        long startTime = System.currentTimeMillis();

        // 1. Fork 작업을 분할한다
        SumTask task1 = new SumTask(1, 4);
        SumTask task2 = new SumTask(5, 8);



        // 2. 분할 작업 처리
        Future<Integer> future1 = executorService.submit(task1);
        Future<Integer> future2 = executorService.submit(task2);

        // 3. join - 처리한 결과 합치기 get: 결과가 나올 때까지 대기한다
        Integer result1 = future1.get();
        Integer result2 = future2.get();
        log("main 스레드 대기 완료");

        int sum = result1 + result2;

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime) + "ms, sum: " + sum);
    }

    static class SumTask implements Callable<Integer> {
        int startValue;
        int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() {
            log("작업시작");
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                int calculated = HeavyJob.heavyTask(i);
                sum += calculated;
            }
            log("작업완료 sum = " + sum);
            return sum;
        }
    }
}
