import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizideki eleman sayısını girin: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Elemanları girin: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, n - 1);
        System.out.println("Hızlı sıralaması bu: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int a = partition(arr, low, high);
            quicksort(arr, low, a);
            quicksort(arr, a + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int b = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < b);
            do {
                j--;
            } while (arr[j] > b);
            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}