
import java.util.Scanner;


public class Vidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0,number;
        System.out.print("enter your number: ");
        number=sc.nextInt();
        do{
            System.out.print(count + ",");
            count++;
            if(count == number){
                System.out.print(count + "");
                break;
            }
        }while(count <= number);
        
        }
    }

