import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia!");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o numero da Conta!");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o Nome do Cliente!");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o Saldo da Conta!");
        float saldo = sc.nextFloat();

        ContaTerminal ct = new ContaTerminal(conta, agencia, nome, saldo);

        System.out.println(ct.toString());

        sc.close();
    }
}
