package com.java.series;
import java.util.Scanner;
public class CustomSeries3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = "0";
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int result = i*i*i;
            int digit = result % 10;
            result = result / 10;
            count = count + 1;
            for (int j = 1; j <= count; j++) {
                num =  num + "0";
            }
            num = (num) + result;
            System.out.println(num+", ");
        }
        sc.close();
    }
}
