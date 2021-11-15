package org.noob.codewars.train.sort.time_nn;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度 o(n*n)
 * <p>
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * <p>
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * <p>
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * <p>
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {

    public static Integer[] sortNoFlag(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    /**
     * {4, 1, 2, 9, 3, 6}
     * @param array
     * @return
     */
    public static Integer[] sort(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        return array;
    }


    public static void main(String[] args) {
        Integer[] array = {4, 1, 2, 9, 3, 6};
        System.out.println(Arrays.toString(sort(array)));
        System.out.println(Arrays.toString(sortNoFlag(array)));
    }
}
