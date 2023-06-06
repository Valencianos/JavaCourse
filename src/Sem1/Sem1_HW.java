package Sem1;

import java.util.Random;

public class Sem1_HW {
    public static void main(String[] args) {
        int num = new Random().nextInt(2000);
        System.out.println(num);
        String a = Integer.toBinaryString(num);
        int n = a.length();
        System.out.println(n);
        int count1 = 0;
        for(int i = num; i <= Short.MAX_VALUE; i++) {
            if (i % n == 0) {
                count1++;
            }
        }
        int[] m1 = new int[count1];
        int k = 0;
        for (int j = num; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[k] = j;
                k++;
            }
        }
        int count2 = 0;
        for(int i = num; i >= Short.MIN_VALUE; i--) {
            if (i % n != 0) {
                count2++;
            }
        }
        int[] m2 = new int[count2];
        int p = 0;
        for (int j = num; j >= Short.MIN_VALUE; j--) {
            if (j % n != 0) {
                m2[p] = j;
                p++;
            }
        }
    }
}
