/*printing ccustom series in the following format : 11,28,327,464,5125,......*/
package com.java.series;
import java.util.Scanner;
public class CustomSeries_III {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int result = i*i*i;
            System.out.print(i+""+result+", ");
        }
        sc.close();
    }
}
