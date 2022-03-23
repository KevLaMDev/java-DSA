package codechallenges;


import codechallenges.mergeSort.MergeSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    void canMergeTwoEqualLengthArrays() {
        MergeSort sut = new MergeSort();
        int[] arr1 = {1, 4, 7};
        int[] arr2 = {3, 6, 8};
        int[] control = {1, 3, 4, 6, 7, 8};
        assert(Arrays.equals(sut.mergeSort(arr1, arr2), control));
    }
    @Test
    void canMergeUnequalLengthArrays() {
        MergeSort sut = new MergeSort();
        int[] arr1 = {4, 7, 8};
        int[] arr2 = {5};
        System.out.println(Arrays.toString(sut.mergeSort(arr1, arr2)));
    }
}
