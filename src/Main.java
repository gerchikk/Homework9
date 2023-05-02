import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {91, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.println(weightsCopy[i]);
            boolean arraysAreEqual = true;
            arraysAreEqual = weights.length == weightsCopy.length;
            if (arraysAreEqual) {
                for (; i < weights.length; i++) {
                    if (weights[i] != weightsCopy[i]) {
                        arraysAreEqual = false;
                    }
                }
            }
            if (arraysAreEqual) {
                System.out.println("Массивы одинаковы");
            } else {
                System.out.println("Массивы разные");
            }
        }
        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
            System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i +1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);

        }

        }
    }






