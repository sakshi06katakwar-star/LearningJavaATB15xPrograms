public class Task38_Find2ndLargestNumber {
    //Find and print the second-largest number in an array.
    public static void main(String[] args) {
//Approach (Without Sorting) We will:
//Assume first element is the largest.
//Compare each element.
//Maintain two variables:
//largest
//secondLargest
        int[] arr = {56,78,25,89,90};
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i=1; i<arr.length; i++) {

            if(arr[i] > largest) { //arr[i]=78 largest = 56(because we have assumed 1st element is the largest)
                secondLargest = largest; //arr[i] is 2nd element as per index
                largest = arr[i];
            }
             else if (arr[i] > secondLargest && arr[i] != largest) {
                 secondLargest = arr[i];   //to prevent duplicates we have used arr[i] != largest
             }
        }
        System.out.println("2nd largest num is : "+secondLargest);
    }
}
