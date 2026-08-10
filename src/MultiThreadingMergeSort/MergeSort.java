package MultiThreadingMergeSort;

import java.util.List;

public class MergeSort {

    List<Integer> list;


    MergeSort(List<Integer> list)
    {
        this.list = list;
        sort(list);
    }

    public void sort(List<Integer> list)
    {
        int n = list.size();
        if(n == 1) return;

        int mid = n/2;
        List<Integer> leftList = list.subList(0, mid);
        List<Integer> rightList = list.subList(mid, n);
        sort(leftList);
        sort(rightList);
    }


}
