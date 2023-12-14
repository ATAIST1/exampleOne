import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[1000];
        int a = 0;
        while(a != -1) {
            a = sc.nextInt();
            if(a != -1){
                arr[count] = a;
                count++;
            }
        }
        System.out.println(count);
        for(int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}