import java.util.ArrayList;
import java.util.List;

public class Intersection {

    // This method finds the intersection of two sorted arrays and returns a list of common elements.
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        // Initialize two pointers to traverse through the arrays.
        int i = 0, j = 0;
        // Create a list to store the common elements between arr1 and arr2.
        List<Integer> ans = new ArrayList<>();

        // Traverse both arrays until the end of either array is reached.
        while (i < arr1.length && j < arr2.length) {
            // If the current element of arr1 is less than that of arr2, increment the pointer i.
            if (arr1[i] < arr2[j]) {
                i++;
            } 
            // If the current element of arr2 is less than that of arr1, increment the pointer j.
            else if (arr2[j] < arr1[i]) {
                j++;
            } 
            // If elements at both pointers are equal, add the element to the list and increment both pointers.
            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Return the list containing the intersection of arr1 and arr2.
        return ans;
    }

    public static void main(String[] args) {
        // Initialize two sorted arrays for comparison.
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        
        // Get the result of the intersection of arr1 and arr2.
        List<Integer> result = intersection(arr1, arr2);

        // Use a traditional for loop to iterate through the result and print each element.
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
