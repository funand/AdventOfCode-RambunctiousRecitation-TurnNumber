import java.util.ArrayList;
import java.util.List;

public class TurnNumbers {
    public static void main(String[] args) {
        List<Integer> list = elvesPlayedUntilPart1(2020);
        for (int i : list) {
            System.out.println(i + ", ");
        }
    }

    private static List<Integer> elvesPlayedUntilPart1(int limit) {
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

//        list.add(3);
//        list.add(1);
//        list.add(2);
        // 1836

//        12,20,0,6,1,17,7
        list.add(12);
        list.add(20);
        list.add(0);
        list.add(6);
        list.add(1);
        list.add(17);
        list.add(7);


        for (int i = 7; i < limit; i++) {
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
