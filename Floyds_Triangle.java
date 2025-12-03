import java.util.*;

public class Floyds_Triangle{
    public static void floydsTriangle(int n){
        int num = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(num+" ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        floydsTriangle(n);
        sc.close();
    }
}