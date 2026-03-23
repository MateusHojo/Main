package teste;

import java.util.Scanner;

import modelos.Comida;
import util.Validacoes;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comida comida = new Comida("Teste", 20);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(comida.toString());
                    break;
                case 2:
                    alterarNome(comida, scanner);
                    break;
                case 3:
                    alterarTipo(comida, scanner);
                    break;
                case 4:
                    comida.saudacao();
                    break;
                case 5:
                    alterarPreco(comida, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Acesso ===");
        System.out.println("1. Mostrar dados da comida");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar tipo");
        System.out.println("4. Mostrar saudação");
        System.out.println("5. Alterar preco");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Comida comida, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            comida.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarTipo(Comida comida, Scanner scanner) {
        System.out.print("Digite o novo tipo: ");
        try {
            int novoTipo = Integer.parseInt(scanner.nextLine());
            if (Validacoes.tipoValido(novoTipo)) {
                comida.setTipo(novoTipo); // corrigido aqui
                System.out.println("Tipo alterado com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroTipo(novoTipo));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um tipo de comida válido!");
        }
    }

    public static void alterarPreco(Comida comida, Scanner scanner) {
        System.out.print("Digite a novo preco (em numeros inteiros, ex: 6): ");
        try {
            double novoPreco = Double.parseDouble(scanner.nextLine());
            if (Validacoes.precoValido(novoPreco)) {
                comida.setpreco(novoPreco);
                System.out.println("Preco alterado com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroPreco(novoPreco));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número válido para o preco!");
        }
    }
}