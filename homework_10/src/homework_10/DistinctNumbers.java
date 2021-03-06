package homework_10;
import java.util.Scanner;
import java.util.ArrayList;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();

            if (!list.contains(value) && value != 0)
                list.add(value);
        } while (value != 0);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}


