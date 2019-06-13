public class LowerBound {

    private LowerBound() { }

    public static int lowerBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String args[])
    {
    int arr[]={2,8,8,8,8,14};
    int val=8;
    int idx=lowerBound(arr,arr.length,val);
    if(idx>=arr.length)
    {
        idx=idx-1;
    }
    else
    {
        if(arr[idx]==val)
        {
            //do nothing
        }
        else
        {
            idx=idx-1;
        }
    }
    System.out.println("Index: "+idx);
    
    //if element is present that index is returned.
    //if not present lower bound is returned.
    //if element is smaller than the smallest then -1.
    //if element is greater than the greatest then index of last element is returned.  
    }
}