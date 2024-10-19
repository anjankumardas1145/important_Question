/*An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once. In the context of strings, two strings are considered anagrams if they contain the same characters in the same frequency but in a different order.

Example of Anagram Strings:
"listen" and "silent" are anagrams because they contain the same letters: l, i, s, t, e, n.
"triangle" and "integral" are anagrams because they use the same characters.*/



public class AnagramSTRING {

        public static boolean isAnagram(String str1, String str2) {
            // First check if both strings have the same length
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert both strings to character arrays
            char[] arr1 = str1.toCharArray();//store in the form of {l,i,s,t,e,n}
            char[] arr2 = str2.toCharArray();//{s,i,l,e,n,t}

            // Sort both arrays manually// arr1[]={e,i,l,n,s,t}
                                             //arr2[]={e,i,l,n,s,t}
            for (int i = 0; i < arr1.length - 1; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] > arr1[j]) {
                        char temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                    if (arr2[i] > arr2[j]) {
                        char temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }
            // after sorting the arr1 will be {e,i,l,n,s,t}
            //                     arr2 will be {e,i,l,n,s,t}

            // Compare both sorted arrays manually
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            boolean result = isAnagram(str1, str2);

            // Print the result
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }
    }
