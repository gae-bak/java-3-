package parallel.forkjoin;

import optional.logger.LogMain1;
import parallel.HeavyJob;
import util.MyLogger;

import java.util.List;
import java.util.concurrent.RecursiveTask;

import static util.MyLogger.*;

public class SumTask extends RecursiveTask<Integer> {
//    private static final int THRESHHOLD = 4; // 임계값
    private static final int THRESHHOLD = 2; // 임계값

    private final List<Integer> list;

    public SumTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {

        if (list.size() <= THRESHHOLD) {
            int sum = list.stream()
                    .mapToInt(HeavyJob::heavyTask)
                    .sum();
            log("[처리 완료] " + list + " -> sum: " + sum);
            return sum;
        } else {
            // 작업 범위가 크면 반으로 나누어 병렬처리
            int mid = list.size() / 2;
            List<Integer> leftList = list.subList(0, mid);
            List<Integer> rightList = list.subList(mid, list.size());
            log("[본할] " + list + " -> LEFT" + leftList + ", RIGHT " + rightList);

            SumTask leftTask = new SumTask(leftList);
            SumTask rightTask = new SumTask(rightList);

            // 왼쪽 작업은 다른 스레드에사 처리
            leftTask.fork(); // 1~4
            // 오른쪽 작업은 현재 스레드에서 처리
            Integer rightResult = rightTask.compute(); // 5~8 -> 260

            // 왼쪽 작업 결과를 기다림
            Integer leftResult = leftTask.join();
            int joinSum = rightResult + leftResult;
            log("LEFT[ + " + leftResult + "] RIGHT [" + rightResult + "] -> sum: " + joinSum );
            return joinSum;
        }
    }
}
