public class Mergesort {
    public int count;

    public int[] mergeSort(int[] arr, int len)
    {
        if(len > 1)
        {
            this.count++;
            int pivot = len/2;
            int[] left = new int[pivot];
            for(int i = 0;i < pivot;i++)
            {
                left[i] = arr[i];
            }

            int[] right = new int[len - pivot];
            for(int i = pivot;i < len;i++)
            {
                right[i - pivot] = arr[i];
            }
            mergeSort(left, left.length);
            mergeSort(right, right.length);
            int i = 0, j = 0, k = 0;
            while(i < left.length && j < right.length)
            {
                this.count++;
                if(left[i] < right[j])
                {
                    this.count++;
                    arr[k] = left[i];
                    i++;
                }
                else
                {
                    arr[k] = right[j];
                    j++;
                }
                k++;
                while(i < left.length)
                {
                    this.count++;
                    arr[k] = left[i];
                    i++;
                    k++;
                }
                while(j < right.length)
                {
                    this.count++;
                    arr[k] = right[j];
                    j++;
                    k++;
                }
            }
        }
        return arr;

    }
}
