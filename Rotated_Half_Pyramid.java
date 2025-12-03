import java.util.*;

public class Rotated_Half_Pyramid {    
    public static void rotated_half_pyramid(int n){
        for(int i = 1; i <= (2 * n - 1); i++){
            int stars = i;
            if(stars > n){
                stars = 2 * n - i;
            }
            for(int j = 1; j <= stars; j++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        rotated_half_pyramid(n);
        sc.close();
    }
}    