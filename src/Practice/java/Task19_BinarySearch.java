public class Task19_BinarySearch {
    //Implement binary search algorithm to find an element in a sorted array.
        public static int BinarySearch (int[] arr, int key) {//key is the element we want to search in the array.
            int low = 0;
            int high = arr.length-1;

            while(low<=high) { //low=0,high=6,key=50
                int mid = (low+high)/2; //mid=3

                if(arr[mid] == key) { // arr[3] = 40 (as per index)
                    return mid;  //mid is the index of the middle element means return 3;
                } else if(arr[mid]<key) { //40<50
                    low = mid+1;  //low=50
                } else {
                    high = mid-1; //high=30
                }
            }
                return -1;  //we use -1 to indicate failure
        }
    public static void main(String[] args) {
       int[] arr = {10,20,30,40,50,60,70};
       int result = BinarySearch(arr,50);

       if(result != -1) {
           System.out.println("Element found at index : "+result);
       } else {
           System.out.println("Element not found");
       }
    }
}
