package optional.logger;

public class LogMain2 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(value100() + value200());

        System.out.println("=== 디버그 모드 끄기 ===");
        logger.setDebug(false);
        // 괄호 안이 연산 1순위, 연산은 반드시 실행
        logger.debug(value100() + value200());

        // 코드 마지막에 추가 if문을 통한 확실한 체크, 코드는 지저분해지지만, 필요 없는 연산 수행 x
        System.out.println("=== 디버그 모드 체크 ===");
        if (logger.isDebug()) {
            logger.debug(value100() + value200());
        }
    }
    static int value100() {
        System.out.println("value 100 호출");
        return 100;

    }

    static int value200() {
        System.out.println("value 200 호출");
        return 100;
    }
}
