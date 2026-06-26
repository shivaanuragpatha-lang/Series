//Program for gnerating series 1, 11, 111, 1111, .....
package com.java.series;
import java.util.Scanner;
public class NumberSeries2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = num*10+1;
            System.out.print(num +", ");
        }
        sc.close();
    }
}
