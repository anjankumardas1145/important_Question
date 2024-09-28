public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4,88,6, 7, 9};
        int[] array2 = {5, 3, 6, 2, 88,9, 8};

        System.out.println("Common elements:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
