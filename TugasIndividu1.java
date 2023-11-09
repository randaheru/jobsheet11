import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            
            for (int k = N - i; k > 0; k--) {
                System.out.print(" ");
            }
            
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}