package com.newjava.algo;

import java.util.ArrayList;
import java.util.List;

public class SumArray {

    static int[] findNumbers(int N)
    {

        List<Integer> uniqueNumbers = new ArrayList<>();

        for (int i = 1; i <= N / 2; i++)
        {
            // Print 2 symmetric numbers
            uniqueNumbers.add(i);
            uniqueNumbers.add(Integer.parseInt("-"+i));
        }

        // Print a extra 0 if N is odd
        if (N % 2 == 1)
            uniqueNumbers.add(0);
        int numbers[] = new int[uniqueNumbers.size()];
        int i = 0;
        for (Integer uniqueNumber : uniqueNumbers) {
            numbers[i] = uniqueNumber;
            i++;
        }
        return numbers;

    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 11;
        for (int number : findNumbers(N)) {
            System.out.println(number);
        }
    }
}
