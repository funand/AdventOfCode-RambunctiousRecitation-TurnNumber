import java.util.ArrayList;
import java.util.List;

public class TurnNumbers {
    public static void main(String[] args) {
        List<Integer> arr = elvesPlayedUntil(2020);
        for (int i : arr) {
            System.out.println(i + ", ");
        }
    }

    private static List<Integer> elvesPlayedUntil(int limit) {
        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(3);
//        list.add(6);
        // 436

//        list.add(1);
//        list.add(3);
//        list.add(2);
        // 1

//        list.add(2);
//        list.add(1);
//        list.add(3);
        // 10

//        list.add(1);
//        list.add(2);
//        list.add(3);
        // 27

//        list.add(2);
//        list.add(3);
//        list.add(1);
        // 78

//        list.add(3);
//        list.add(2);
//        list.add(1);
        // 438

        list.add(3);
        list.add(1);
        list.add(2);
        // 1836

        for (int i = 3; i < limit; i++) {
            int prev = list.get(i - 1);

            if (occursMoreThanOnce(list, prev)) {
                int index = i - 2;

                while (index >= 0) {
                    if (list.get(index) == prev) {
                        list.add(i - 1 - index);
                        break;
                    }
                    index--;
                }
            } else {
                list.add(0);
            }

        }
        return list;
    }

    static boolean occursMoreThanOnce(List<Integer> list, int target) {
        int cnt = 0;
        for (int k : list) {
            if (target == k) {
                cnt++;
            }
        }
        return cnt > 1;
    }
}
