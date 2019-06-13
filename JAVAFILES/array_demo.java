
import java.util.*;
import java.util.Arrays;

public class array_demo {

   public static void main(String[] args) {

   // initializing unsorted long array
   long longArr[] = {56,46464,3342,231,3445};

   // sorting array
   Arrays.sort(longArr);

   // let us print all the elements available in list
   System.out.println("The sorted long array is:");
   for (long number : longArr) {
   System.out.println("Number = " + number);
   }

   // entering the value to be searched
   long searchVal = 44;

   // entering range of index
   int retVal = Arrays.binarySearch(longArr,1,2,searchVal);

   System.out.println("The index of element 232 is : " + retVal);
   }
}