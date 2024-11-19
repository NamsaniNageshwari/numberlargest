public class LargestNumberInArray {
    public static void main(String[] args) {
        // Example array
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Call the method to find the largest number
        int largest = findLargest(arr);

        // Output the largest number
        System.out.println("The largest number in the array is: " + largest);
    }

    // Method to find the largest number in an array
    public static int findLargest(int[] arr) {
        int largest = arr[0];  // Assume the first element is the largest initially

        // Loop through the array to compare each element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  // Update largest if a larger element is found
            }
        }

        return largest;  // Return the largest element
    }
}

