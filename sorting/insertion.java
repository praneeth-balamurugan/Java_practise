public class insertion {

    // Method to perform Insertion Sort
    void sort(int arr[]) {
        int n = arr.length;  // Get the length of the array
        for (int i = 1; i < n; ++i) {  // Iterate from the second element to the end
            int key = arr[i];  // The element to be inserted in the sorted portion
            int j = i - 1;  // Start comparing with the element just before 'i'

            // Move elements of arr[0..i-1], that are greater than key, one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element at index j to index j + 1
                j = j - 1;  // Move to the next element on the left
            }
            arr[j + 1] = key;  // Insert the key into its correct position
        }
    }

    // Method to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // Print a new line after printing the array
    }

    // Main method to test the sorting algorithm
    public static void main(String[] args) {
        insertion sorter = new insertion();  // Create an instance of the class

        int[] arr = {12, 11, 13, 5, 6};  // Example array to be sorted
        System.out.println("Original array:");
        sorter.printArray(arr);  // Print the original array

        sorter.sort(arr);  // Sort the array using Insertion Sort

        System.out.println("Sorted array:");
        sorter.printArray(arr);  // Print the sorted array
    }
}
