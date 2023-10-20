import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    private static Integer getRandom() {
        int i = new Random().nextInt();
        return Math.abs(i);
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        int i = 0;

        while (i < 50000) {
            Integer key = getRandom();
            if (map.containsKey(key) == false) {
                map.put(key, "Margo #" + i);
                i++;
            }

        }

        System.out.println(Arrays.asList(map));
        System.out.println(map.size());
    }
}

