import java.util.HashMap;
import java.util.Scanner;

public class AppArmazenar {

    public static void main(String[] args) {
        HashMap<String, String> lista = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o CPF:");
            String cpf = sc.nextLine();

            System.out.println("Informe o telefone:");
            String telefone = sc.nextLine();

            lista.put(cpf, telefone);
        }
        sc.close();

        System.out.println("Lista contendo CPF e Telefone:");
        for (var e : lista.entrySet()) {
            System.out.println("CPF: " + e.getKey() + " - Telefone: " + e.getValue());
        }
    }
}
