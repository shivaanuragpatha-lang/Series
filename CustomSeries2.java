/*Printing numbers upto N where each number follows same pattern.
*   i.e., 2 = 2^3-1 = 8-1 = 7
* example: 7,26,63,124.....*/
package com.java.series;
import java.util.Scanner;
public class CustomSeries2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        for (int i = 1; i <= n; i++) {
            num = (i*i*i)-1;
            System.out.print(num +", ");
        }
    }
}
