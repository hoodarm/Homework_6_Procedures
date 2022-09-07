package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {1, 3, 4, 6, 5, 7, 6, 9, 10, 11, 14, 15};
        int[] output = (alternate(a));
        for (int el : output)
        {
            System.out.print(el + " ");
        }
    }

    static int[] alternate(int[] a)
    {
        int length = a.length;
        int[] result = new int[length];
        for (int i = 0; i <= length / 2; i++)
        {
            if ((length%2==0)&&(i == length / 2))
            {
                result[2 * i - 1] = a[i];
            }
            else
                result[2 * i] = a[i];
        }
        for (int i = length / 2 + 1; i < length; i++)
        {
            result[2 * (length - 1 - i) + 1] = a[i];
        }
        return result;
    }
}
