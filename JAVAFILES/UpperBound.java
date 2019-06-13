public class UpperBound {

    private UpperBound() { }

    public static int upperBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

     public static void main(String args[])
    {
    int arr[]={2,5,7,10,10,15,17};
    int val=19;
    int idx=upperBound(arr,arr.length,val);//just upper bound is returned.
        if(idx!=0)
        {
            if(arr[idx-1]==val)
            {
                idx=idx-1;
            }
            else
            {
                //do nothing.
            }
        }
    System.out.println("Index is: "+idx);

    //if element is present then that index is returned.
    //if not present then upper bound is returned.
    //if smaller than the smallest then 0.
    //if larger than the largest then index... one greater than the last element is returned.
    }
}