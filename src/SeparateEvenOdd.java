import java.util.Scanner;

public class SeparateEvenOdd {

    public int[] separate(int arr[]){
        int left=0,right= arr.length-1;
        for(int i=0;i<arr.length;i++){
            while(arr[left]%2==0){
                left++;
            }
            while(arr[right]%2==1){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much element you wanna enter");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
        }
        SeparateEvenOdd seo = new SeparateEvenOdd();
        seo.separate(arr);
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);

        }
    }

}
