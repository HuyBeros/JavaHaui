import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("");
            System.out.print("Nhap so nguyen n : ");
            n = sc.nextInt(); // nhap n
            if (n < 2 || n > 8) { // truong hop khong thoa man
                System.out.print("Khong thoa man , yeu cau nhap lai!");
            }
        } while (n < 2 || n > 8);
       int[][] a = new int[n][n];
       int h1=0,h2=n-1,c1=0,c2=n-1;// h1 là hàng trên cùng, h2 là hàng dưới cùng, c1 là cột ben trái, c2 là cột bên phải
       int value=1;//giá trị bắt đầu chạy từ 1
       while(c1<=c2 && h1<=h2){ //vòng lặp while chạy đến khi thỏa mãn điều kiện
           for(int i=c1;i<=c2;i++){  // vòng lặp giá trị +1 từ c1-c2
           a[h1][i]=value; 
           value++; // giá trị tăng dần sau mỗi lần lặp
       }
       h1++; // giá trị đã được tăng đều ở hàng 0, chuyển sang hàng 1
       for(int i=h1;i<=h2;i++){ // bắt đầu chạy từ hàng 2 và cột bên phải
           a[i][c2]=value;
           value++;
       }
       c2--; // đã có giá trị ở cột n-1, rút về cột n-2
       for(int i=c2;i>=c1;i--){ // chạy từ cột n-2 đến cột 0
           a[h2][i]=value;
           value++;
       }
       h2--; // đã có giá trị ở hàng n-1, rút về hàng n-2
       for(int i=h2;i>=h1;i--){ // chạy từ hàng n-2 đến hàng h1++
           a[i][c1]=value;
           value++;
       }
       c1++;// tăng giá trị c1 lên 1
       // vòng lặp tiếp tục cho đến khi thỏa mãn điều kiện
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print(a[i][j] + " ");
           }
           System.out.println("");
       }
       
    }
}
