/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workday;

import java.util.Scanner;

/**
 *
 * @author Vitor Hugo
 */
public class Workday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opcao;
        do {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Realizar cadastros");
            System.out.println("2 - Administar benefícios");
            System.out.println("3 - Pagadoria");
            System.out.println("4 - Funcionários");
            System.out.println("5 - Relatórios ");
            System.out.println("S - Sair");

            opcao = Character.toUpperCase(scanner.next().charAt(0));

            switch (opcao) {
                case '1':
                    //codigo
                    break;
                case '2':
                    //codigo
                    break;
                case '3':
                    //codigo 
                    break;
                case '4':
                    //codigo 
                    break;
                case '5':
                    //codigo 
                    break;
                case 'S':
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 'S');

        scanner.close();
    }

}
