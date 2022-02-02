public class scratch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,10};
        int n = arr.length;
        int key = 10;
        System.out.println(binarySearch(arr, 0, n - 1, key));
    }
    public static int recursiveBinarySearch(int[] list, int leftIndex, int rightIndex, int key){
        if(rightIndex >= 1 && 1 <= list.length - 1){
            int mid = 1 + (rightIndex - 1) / 2;
            if(list[mid] == key){
              return mid;
            }
            if(list[mid] > key){
              return recursiveBinarySearch(list, 1, mid - 1, key);
            }
            return recursiveBinarySearch(list, mid + 1, rightIndex, key);
        }
        return -1;
    }
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (r >= l && l <= arr.length - 1) {
 
            int mid = l + (r - l) / 2;
 
            // If the element is present
            // at the middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present in
        // array
        return -1;
    }
}

