package codechallenges.mergeSort;

public class MergeSort {

    public MergeSort() { }

    public int[] merge(int[] arr1, int[] arr2) {
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
        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }
        return newArr;
    }

    // write recursive func that returns an int array
    // mergeSort(int[] arr)
    // basecase: arr.length <= 1;
    // Integer mid = arr.length/2;
    // int[] left = mergeSort(Arrays.copyOfRange(0, mid - 1))
    // int[] right = mergeSort(Arrays.copyOfRange(mid);
    // return merge(left, right);
}
