import java.util.HashMap;
import java.util.Scanner;

public class AppEncontrarCpf {
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
        System.out.println("Lista contendo CPF e Telefone:");
        for (var e : lista.entrySet()) {
            System.out.println("CPF: " + e.getKey() + " - Telefone: " + e.getValue());
        }
        System.out.println("Digite o CPF que você deseja procurar:");
        String cpfProcurado = sc.nextLine();

        String telefoneAssociado = lista.get(cpfProcurado);

        System.out.println("Telefone associado ao CPF " + cpfProcurado + ": " + telefoneAssociado);

        sc.close();
    }
}
