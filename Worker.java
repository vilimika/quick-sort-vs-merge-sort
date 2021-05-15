import java.util.*;
import java.util.stream.IntStream;

public class Worker {

    public static int[] srt32 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
    public static int[] rev32 = {32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
    public static int[] rand32;
    public static int[] n2to10;
    public static int[] n2to15;
    public static int[] n2to20;
    public static int count = 0;

    public int compare(int val1, int val2)
    {
        this.count++;
        if(val1>val2)
            return 1;
        else
            return 0;
    }

    public void genArr(int size)
    {
        int arr[] = new int[size];
        Random rand = new Random();
        for(int i = 0;i<size;i++)
        {
            arr[i] = rand.nextInt(50);
        }
        if(size == 32)
            setRand32(arr);
        if(size == 1024)
            setn2to10(arr);
        if(size == 32768)
            setn2to15(arr);
        if(size == 1048576)
            setn2to20(arr);
    }

    public void setn2to20(int[] arr)
    {
        this.n2to20 = arr;
    }

    public void setn2to15(int[] arr)
    {
        this.n2to15 = arr;
    }

    public void setn2to10(int[] arr)
    {
        this.n2to10 = arr;
    }

    public void setRand32(int[] arr)
    {
        this.rand32 = arr;
    }
}

