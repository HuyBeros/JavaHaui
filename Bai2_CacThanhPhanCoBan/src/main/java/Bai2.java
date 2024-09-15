
import java.util.Scanner;


public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h;
        do{
            System.out.println("");
            System.out.print("Nhap chieu cao h: ");
            h = sc.nextInt(); //nhap h
            if(h<2 || h>10){ //truong hop khong thoa man
                System.out.print("Khong thoa man , yeu cau nhap lai!");
            }
        }
        while(h<2 || h>10); // neu h khong thoa man lap lai lenh do
        for(int i=1;i<=h;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
