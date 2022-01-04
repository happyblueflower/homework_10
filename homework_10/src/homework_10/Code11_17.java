package homework_10;

import java.util.Scanner;
import java.util.ArrayList;

public class Code11_17 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a integer m: ");
        int m = input.nextInt();
        int yz = 2;
        int temp = m;
        while (temp != 1) {
            // System.out.println(temp);
            if (temp % yz == 0) {
                list.add(yz);
                temp /= yz;
            } else {
                yz++;
            }
        }
        int ans = 1;
        int i = 0;
        yz = 2;
        while (i < list.size()) {
            if (list.contains(yz)) {
                int num = list.lastIndexOf(yz) - i + 1;
                i = list.lastIndexOf(yz) + 1;
                if (num % 2 == 1) {
                    ans *= yz;
                }
            }
            yz++;
        }
        System.out.println("The smallest number n for m * n to be a perfect square is " + Math.sqrt(m * ans));
        System.out.println("m * n is " + ans * m);
    }
}

