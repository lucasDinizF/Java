public class insertionSort {
        public static void insertion(int[] List){
            int size = List.length;                             // 0

            for (int i = 0; i < size; i++){                     // 1      n
                int Key = List[i];                              // 0
                int j = i - 1;                                  // 0

                for (; j >= 0 && List[j] > Key; j--){           // 2      n - 1
                    List[j + 1] = List[j];                      // 0

                }

                List[j + 1] = Key;                              // 0

                                                                // n(n - 1)
                                                                // n^2 - n
                                                                // O(n^2)

            }
        }
    }
