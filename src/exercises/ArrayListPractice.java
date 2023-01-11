package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(5);
        intList.add(9);
        intList.add(6);
        intList.add(4);
        intList.add(4);
        intList.add(2);
        intList.add(2);
        intList.add(0);
        intList.add(1);
        System.out.println(intList);

        Integer sum = 0;
        for (int num : intList) {
            if(num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
