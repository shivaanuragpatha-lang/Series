/*printing ccustom series in the following format : 11,28,327,464,5125,......*/
package com.java.series;
import java.util.Scanner;
public class CustomSeries3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = 0;
        int count;
        int ressult;
        for (int i = 1; i <= n; i++) {
            int result = i*i*i;
            count = 0;
            int temp = result;
            while(temp>0){
            int digit = temp % 10;
            count = count + 1;
            temp = temp / 10;
            }
            num = (long)i*(long)Math.pow(10,count) + result;  //The resultant number might lead to a large number. So, it need to be converted into long datatype.
            System.out.print(num);
            if(i<n){
                System.out.print(",");
            }
        }
        sc.close();
    }
}
