package com.newjava.algo;

/**
 * @author Amandeep Singh on 3/12/22/03/2022
 */
public class MergeTwoSortedArrays {

    public static void main(String arg[]) {

        int[] a= {1,2,3,4,5,6, 7,8,9,10,11};
        int[] b = {1,4,7,8,9, 10, 11,12,13};
        int c[] = new int[a.length + b.length];

        int i = 0, j =0;
        int cIndex = 0;
        while(i < a.length && j < b.length) {
            if(a[i] == b[j]) {
                int val = a[i];
                c[cIndex] = val;
                c[++cIndex] = val;
                cIndex++;
                j++;
                i++;
            } else if(a[i] < b[j]) {
                c[cIndex] = a[i];
                cIndex++;
                i++;
            } else {
                c[cIndex] = a[j];
                cIndex++;
                j++;
            }
        }

        if(i < a.length) {
            for (int k = i ; k < a.length ; k++) {
                c[cIndex] = a[k];
                cIndex ++;
            }
        }

        System.out.println("j : "+j);
        if(j < b.length) {
            for (int k = j ; k < b.length ; k++) {
                c[cIndex] = b[k];
                cIndex ++;
            }
        }

        for (int val :
                c) {
            System.out.println(val);
        }
    }
}
