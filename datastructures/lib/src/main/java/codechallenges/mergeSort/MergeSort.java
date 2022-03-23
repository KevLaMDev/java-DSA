package codechallenges.mergeSort;

public class MergeSort {

    public MergeSort() { }

    public int[] mergeSort(int[] arr1, int[] arr2) {
        if (arr1.length < 1) return arr2;
        if (arr2.length < 1) return arr1;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArr = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i += 1;
            } else {
                newArr[k] = arr2[j];
                j += 1;
            }
            k += 1;
        }
        if (i == arr1.length) {
            for (int a = j; a < arr2.length; a++) {
                newArr[k] = arr2[a];
                k += 1;
                // a ==
                // arr1 [ 1 , 5 ]
                // arr2 [ 3 , 4, 8 ]
                // newArr [ 1, 3]
            }
        } else if (j == arr2.length) {
            for (int a = i; i < arr1.length; a++) {
                newArr[k] = arr1[a];
                k += 1;
            }
        }
        return newArr;
    }
}
