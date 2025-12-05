package parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ForkJoinMain2 {
    public static void main(String[] args) {
        int processorCount = Runtime.getRuntime().availableProcessors();
        long l = Runtime.getRuntime().maxMemory();
        System.out.println(l);
        long l1 = Runtime.getRuntime().freeMemory();
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        // cpu core 개수 + 기용가능한 스레드 수
        log("processcount = " + processorCount + ", commonPool = " + commonPool.getParallelism());

        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();

        log("[생성] " + data);

        SumTask task = new SumTask(data);
        Integer result = task.invoke(); // 공용 풀 사용
        log("최종 결과: " + result);
        System.out.println(l1);
    }
}
