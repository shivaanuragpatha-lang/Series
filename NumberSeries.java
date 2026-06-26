//Program for generating number series: 1, 4., 9, 16, .....
package com.java.series;
import java.util.Scanner;
public class NumberSeries {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Generating the number series:");
        for (int i = 1; i <= n; i++) {
            int series = i*i;
            System.out.print(series +", ");
        }
        sc.close();

    }
}
