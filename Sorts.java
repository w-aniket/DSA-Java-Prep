
import java.util.ArrayList;
import java.util.Scanner;

class Solutions {
    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
        return arr;
    }

    public void merge(int[] arr, int s, int mid, int e) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = s, j = mid + 1;
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= e) {
            temp.add(arr[j]);
            j++;
        }

        for (i = 0; i < temp.size(); i++) {
            arr[i + s] = temp.get(i);
        }
    }

    public int[] mergeSort(int[] arr, int s, int e) {
        if (s >= e) {
            return arr;
        }

        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, mid, e);

        return arr;
    }

    public int partition(int[] arr, int s, int e) {
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] < arr[e]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;
        return i;
    }

    public int[] quickSort(int[] arr, int s, int e) {

        if (s >= e) {
            return arr;
        }

        int pivot = partition(arr, s, e);
        quickSort(arr, s, pivot - 1);
        quickSort(arr, pivot + 1, e);

        return arr;
    }

}

public class Sorts {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 9, 5, 7, 8, 4 };
        Solutions s = new Solutions();
        Scanner sc = new Scanner(System.in);

        // Arrays.sort(arr);// In-build sorting technique

        System.out.print(
                "1. Bubble Sort \n 2. Insertion Sort \n 3. Selection Sort \n 4. Merge Sort \n 5. Quick Sort \n Enter your Choice:");
        int choice = sc.nextInt();
        long start = System.nanoTime();
        switch (choice) {
            case 1:
                s.bubbleSort(arr);
                break;
            case 2:
                s.insertionSort(arr);
                break;
            case 3:
                s.selectionSort(arr);
                break;
            case 4:
                s.mergeSort(arr, 0, arr.length - 1);
                break;
            case 5:
                s.quickSort(arr, 0, arr.length - 1);
                break;

            default:
                System.out.println("Exit...");
                break;
        }

        long end = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
        System.out.println("Time Taken: " + (end - start) + " ns");

        sc.close();
    }
}
