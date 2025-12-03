import java.util.*;

public class Half_Pyramid {
    public static void halfPyramid(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        halfPyramid(n);
        sc.close();
    }
}