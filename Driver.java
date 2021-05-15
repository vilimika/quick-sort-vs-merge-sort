import java.io.*;
import java.util.*;

public class Driver
{
    public static void main(String[] args) {

        Worker doer = new Worker();
        doer.genArr(32);
        doer.genArr(1024);
        doer.genArr(32768);
        doer.genArr(1048576);

        sortSmall(doer.srt32,doer.rev32, doer.rand32, 'q');
        sortSmall(doer.srt32,doer.rev32, doer.rand32, 'm');

    }

    public static void sortSmall(int[] arr1, int[] arr2, int[] arr3, char type)
    {
        long start, finish;
        int comps;
        int[] result = new int[32];
        if(type == 'q')
        {
            Quicksort qsort = new Quicksort();
            start = System.nanoTime();
            result = qsort.quicksort(arr1, 0, arr1.length-1);
            finish = System.nanoTime();
            comps = qsort.count;
            System.out.println("Sorted array : " + Arrays.toString(result));
            System.out.println("Quicksort sorted array comparison count n=32 " + comps + "\n Time elapsed " + (finish-start) + " nanoseconds\n");

            start = System.nanoTime();
            result = qsort.quicksort(arr2, 0, arr2.length-1);
            finish = System.nanoTime();
            comps = qsort.count;
            System.out.println("Sorted array : " + Arrays.toString(result));
            System.out.println("Quicksort reverse sorted array comparison count n=32 " + comps + "\n Time elapsed " + (finish-start) + " nanoseconds\n");

            start = System.nanoTime();
            result = qsort.quicksort(arr3, 0, arr3.length-1);
            finish = System.nanoTime();
            comps = qsort.count;
            System.out.println("Sorted array : " + Arrays.toString(result));
            System.out.println("Quicksort random array comparison count n=32 " + comps + "\n Time elapsed " + (finish-start) + " nanoseconds\n");
        }
        if(type == 'm')
        {
            Mergesort msort = new Mergesort();
            start = System.nanoTime();
            result = msort.mergeSort(arr1, arr1.length);
            finish = System.nanoTime();
            comps = msort.count;
            System.out.println("Sorted array : " + Arrays.toString(result));
            System.out.println("Mergesort sorted array comparison count n=32 " + comps + "\n Time elapsed " + (finish-start) + " nanoseconds\n");

            start = System.nanoTime();
            result = msort.mergeSort(arr2, arr2.length);
            finish = System.nanoTime();
            comps = msort.count;
            System.out.println("Sorted array : " + Arrays.toString(result));
            System.out.println("Mergesort reverse sorted array comparison count n=32 " + comps + "\n Time elapsed " + (finish-start) + " nanoseconds\n");

            start = System.nanoTime();
            result = msort.mergeSort(arr3, arr3.length);
            finish = System.nanoTime();
            comps = msort.count;
            System.out.println("Sorted array : " + Arrays.toString(result));
            System.out.println("Mergesort random array comparison count n=32 " + comps + "\n Time elapsed " + (finish-start) + " nanoseconds\n");
        }
    }
}
