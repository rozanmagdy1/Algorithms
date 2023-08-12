public class Searching {
    public boolean linearSearch(int[] arr, int value){
        for (int i: arr){
            if(i == value)
                return true;
        }
        return false;
    }
    public boolean binarySearchIterative(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return true;
            else if (arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
    public boolean binarySearchRecursive(int[] arr, int key, int low, int high){
        if(low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return true;
            if (arr[mid] > key)
                binarySearchRecursive(arr, key, low, mid -1);
            else
                binarySearchRecursive(arr, key, low + 1, mid);
        }
        return false;
    }
}
