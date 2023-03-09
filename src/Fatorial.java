import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int resp = S.nextInt();
        int fatorial=1;
        for (int i=1; i<=resp; i++){
                fatorial*=i;
        }
        System.out.println(fatorial);
    }
}
