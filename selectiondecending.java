import java.util.Scanner;

public class selectiondecending {
    public static void descending(int arr[]){
        for(int i = 0;i<arr.length - 1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest] <arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        descending(arr);
        print(arr);
    }
}
