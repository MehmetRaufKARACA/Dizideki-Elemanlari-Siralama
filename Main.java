import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        int lenght, temp = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sıralanacak sayı adedi : ");
        lenght = scan.nextInt();

        if(lenght > 0){
            int arr [] = new int [lenght];

            for(int i = 0; i < lenght; i++){
               System.out.printf("%d. elemanı giriniz : ", i+1);
                arr[i] = scan.nextInt();
            }

            for(int i = 0; i < lenght; i++){
                for(int j = i+1; j < lenght; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Siralanmis dizi: "+Arrays.toString(arr));
        } else {
            System.out.print("Hatali giris.");
            System.exit(0);
        }
    }
}