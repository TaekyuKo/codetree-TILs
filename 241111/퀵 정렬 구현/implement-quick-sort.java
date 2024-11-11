import java.util.*;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low-1;

        for(int j =low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap
        int temp1 = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp1;
        
        return i+1;
    }

    public static void quick_sort(int[] arr, int low, int high){
        if(low<high){
            int pos = partition(arr, low, high);

            quick_sort(arr,low,pos-1);
            quick_sort(arr,pos+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n-1;
        quick_sort(arr,low,high);

        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}