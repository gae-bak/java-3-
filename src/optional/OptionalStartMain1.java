package optional;

import java.util.HashMap;
import java.util.Map;

public class OptionalStartMain1 {
    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Kim");
        map.put(2L, "Seo");
    }

    public static void main(String[] args) {
        findAndPrint(1L); // 값이 있는 경우
        findAndPrint(3L); // 값이 없는 경우
    }

    static void findAndPrint(Long id) {
        String name = findNameById(id);
        // NPE
        // System.out.println("name.toUpperCase() = " + name.toUpperCase());

        // if문 활용
        if (name != null) {
            System.out.println(id + ": " + name.toUpperCase());
        } else {
            System.out.println(id + ": UNKNOWN");
        }
    }

    static String findNameById(Long id) {
        return map.get(id);
    }
}
