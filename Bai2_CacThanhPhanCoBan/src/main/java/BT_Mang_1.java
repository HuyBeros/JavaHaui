
import java.util.Scanner;


public class BT_Mang_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
             a[i] = sc.nextInt();
         }
        System.out.print("Mang A khi chua sap xep: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i] > a[j]){
                     int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
