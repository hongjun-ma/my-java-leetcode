import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];

        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            array3[i] = scanner.nextInt();
        }

        // 结果
        int result = kthLargestElement(n, k, array1, array2, array3);
        System.out.println(result);
    }

    private static int kthLargestElement(int n, int k, int[] array1, int[] array2, int[] array3) {
        // 合并
        int[] mergedArray = new int[3 * n];
        System.arraycopy(array1, 0, mergedArray, 0, n);
        System.arraycopy(array2, 0, mergedArray, n, n);
        System.arraycopy(array3, 0, mergedArray, 2 * n, n);

        // 排序
        Arrays.sort(mergedArray);

        // 返回第k大的元素
        return mergedArray[k-1];
    }
}
