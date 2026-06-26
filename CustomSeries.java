//Program for generating custom series.
package com.java.series;
import java.util.Scanner;
public class CustomSeries {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int n = sc.nextInt();
        int num =0;
        for (int i = 1; i <= n; i++) {
            num = i*(i+1);       //Custom series are the series that follow same pattern.
            System.out.print(num +", ");
        }
        sc.close();
    }
}
