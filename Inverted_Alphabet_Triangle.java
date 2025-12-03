import java.util.*;

public class Inverted_Alphabet_Triangle{
    public static void invertAlphaTriangle(int n){
        for(int i = n; i >= 0; i--){
            for(char ch = 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        invertAlphaTriangle(n);
    }
}