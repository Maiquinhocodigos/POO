import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("De quantos meses foram os gastos?");
        int meses = sc.nextInt();
        int resultado = 0;

        for (int i = 0; i < meses; i++) {
            int valor = sc.nextInt();
            resultado += valor;
        }

        System.out.printf("Foram gastos: R$%d Mil", resultado);
        sc.close();

    }
}
