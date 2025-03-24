package application;

import java.util.Locale;
import java.util.Scanner;

import application.model.IphoneMainMenu;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("------------Tela inicial------------");
            System.out.println("BLOQUEADO");
            System.out.println("DESBLOQUEI PRECIONANDO 'S'");

            char start = sc.next().charAt(0);

            if (start != 'S') {
                System.out.println("Opção inválida! Encerrando o programa...");
                return;
            }

            for (int i = 0; i < 50; i++) {
                System.out.print("|");
                System.out.print("||");
            }
            System.out.println("\nDesbloqueado!\n");

            IphoneMainMenu iphone = new IphoneMainMenu();

            while (true) {
                System.out.println("------------MENU PRINCIPAL------------");
                System.out.println("1 - Reprodutor Musical");
                System.out.println("2 - Aparelho Telefônico");
                System.out.println("3 - Navegador na Internet");
                System.out.println("4 - Sair");
                System.out.print("Escolha uma opção: ");

                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Reprodutor Musical:");
                        iphone.selectMusic("Brega funk");
                        iphone.play();
                        iphone.pause();
                        iphone.close();
                        break;

                    case 2:
                        System.out.println("Aparelho Telefônico:");
                        iphone.turnOn();
                        iphone.answer();
                        iphone.call();
                        iphone.startVoiceMail();
                        iphone.turnOff();
                        break;

                    case 3:
                        System.out.println("Navegador na Internet:");
                        iphone.displayPage("https://www.google.com");
                        iphone.search();
                        iphone.addNewTab();
                        iphone.updatePage();
                        break;

                    case 4:
                       
                        System.out.println("Encerrando o programa...");
                        return;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }

                System.out.println("\nPressione Enter para continuar...");
                sc.nextLine(); 
                sc.nextLine(); 
            }
        }
    }
}