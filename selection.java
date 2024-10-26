import java.util.Scanner;

public class selection {
    public static void sorting(int arr[]){
        for(int i = 0;i<arr.length - 1; i++){
           int smmalest = i;
            for(int j = i+1 ;j<arr.length ;j++){
                if(arr[smmalest] > arr[j]){
                   smmalest  = j;
                }
            }
            int temp = arr[smmalest];
            arr[smmalest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length ;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,3,2};
        sorting(arr);
        printArr(arr);
    }
}
