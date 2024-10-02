public class Alternate {
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4,8, 5, 6,9};
            int[] alternateArray = new int[originalArray.length];// after alterting the array the length will be same so the length same as original array
            for (int i = 0; i < originalArray.length - 1; i += 2) {
                alternateArray[i] = originalArray[i + 1];//  for first iteration  2 is stored in altarr[0]
                alternateArray[i + 1] = originalArray[i];// 1 is stored in altarr[1]
            }
//  if there is odd number of element in the array then the last element remain same at his position
            if (originalArray.length % 2 != 0) {
                alternateArray[originalArray.length - 1] = originalArray[originalArray.length - 1];
            }

// Print the alternate array
            System.out.println("Original Array:");
            printArray(originalArray);
            System.out.println("Alternate Array:");
            printArray(alternateArray);
        }

        // Utility method to print an array
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
