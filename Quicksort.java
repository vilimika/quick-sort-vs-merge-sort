import java.util.Arrays;

public class Quicksort
{
    public int count = 0;

    public int[] quicksort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int index = partition(arr,left, right);

            quicksort(arr, left, index-1);
            quicksort(arr, index+1, right);
        }
        return arr;
    }

    public int partition(int arr[], int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                this.count++;
                i++;
                int temp = arr[i];
                arr[i]   = arr[j];
                arr[j]   = temp;
            }
        }
        int temp   = arr[i+1];
        arr[i+1]   = arr[right];
        arr[right] = temp;
        return i+1;
    }
}
