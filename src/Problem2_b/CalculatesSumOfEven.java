package Problem2_b;

import java.util.ArrayList;

public class CalculatesSumOfEven {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(8);
        num.add(10);
        num.add(15);

        int sum = sumOfEvenNum(num);
        System.out.println("Sum of even numbers: "+sum);

    }

    public  static  int sumOfEvenNum(ArrayList<Integer> num) {
        int sum = 0;
        for (int i : num) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

