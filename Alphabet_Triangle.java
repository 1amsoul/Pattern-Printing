import java.util.*;

public class Alphabet_Triangle{
    public static void alphabetTriangle(int n){
        for(int i = 0; i <= n; i++){
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
        alphabetTriangle(n);
        sc.close();
    }
}