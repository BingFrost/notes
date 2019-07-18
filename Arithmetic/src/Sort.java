import java.util.Scanner;


public class Sort {

    private static int[] sort = {100,99,98,97,96,95,94,93,92,91,90};

    /**
     * 冒泡排序
     * 从数组中第一个值开始，与第二个值进行比较，将小的值放到后面，依次将最小值放在最后
     * 然后再从第一个值开始，与第二个值进行比较，再将小值放到后面
     * 第一次时所有的值都参与了比较，第二次时最后那个最小值就不参与比较了。
     */
    public static void bubbleSort() {
        /*Scanner input = new Scanner(System.in);
        int [] sort = new int[10];

        System.out.println("输入10个排序的数据");
        for (int i = 0; i < sort.length; i++) {
            sort[i] = input.nextInt();
        }*/
        int temp;
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - 1 - i; j++) {
                if (sort[j] < sort[j + 1]) {
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的顺序为：");
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i] + " ");
        }
    }

    /**
     * 选择排序，每一趟从待排序序列中找到最大值，放在首位
     * 剩下的待排序序列重复上述步骤直至完成。
     */
    public static void selectSort() {
        int temp;
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[i] < sort[j]) {
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        System.out.println("排序后的顺序为：");
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i] + " ");
        }
    }

    /**
     * 直接插入排序
     */
    public static void insertionSort() {
        for (int i = 0; i < sort.length - 1; i++) {
            int temp = sort[i + 1];
            if (sort[i] > sort[i + 1]) {
                int j = i;
                while (j >= 0 && sort[j] > temp) {
                    sort[j + 1] = sort[j];
                    j--;
                }
                sort[j + 1] = temp;
            }
        }
        System.out.println("插入法排序后的顺序为：");
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i] + " ");
        }
    }


    public static void main(String[] args) {
        //bubbleSort();
        //selectSort();
        insertionSort();
    }
}
