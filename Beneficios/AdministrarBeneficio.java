package Beneficios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdministrarBeneficio {
    private static List<Beneficio> beneficios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void listarMenus() {
        int opcao = 0;
        do {

            System.out.print("Escolha uma opção: ");
            System.out.println("1 - Cadastrar Benefício");
            System.out.println("2 - Listar Benefícios");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarBeneficio();
                    break;
                case 2:
                    listarBeneficios();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarBeneficio() {
        System.out.print("Digite o nome do benefício: ");
        String nome = scanner.nextLine();
        Beneficio beneficio = new Beneficio(nome);
        beneficios.add(beneficio);
        System.out.println("Benefício cadastrado com sucesso!");
    }

    private static void listarBeneficios() {
        if (beneficios.isEmpty()) {
            System.out.println("Nenhum benefício cadastrado!");
        } else {
            System.out.println("Benefícios cadastrados:");
            for (Beneficio beneficio : beneficios) {
                System.out.println("- " + beneficio.getNome());
            }
        }
    }
}
